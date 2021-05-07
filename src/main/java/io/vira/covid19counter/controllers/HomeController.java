package io.vira.covid19counter.controllers;

import java.awt.Taskbar.State;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.vira.covid19counter.models.LocationState;
import io.vira.covid19counter.services.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		//model.addAttribute("locationStats",coronaVirusDataService.getAllStats());
		
		List<LocationState> allStates = coronaVirusDataService.getAllStats();
		int totalReportedCases = allStates.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		int totalNewCases = allStates.stream().mapToInt(stat -> stat.getDifferFromPrevDay()).sum();
		model.addAttribute("locationStats",allStates);
		model.addAttribute("totalReportedCases",totalReportedCases);
		model.addAttribute("totalNewCases",totalNewCases);
		 
		return "home";
	}
}
