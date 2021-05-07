package io.vira.covid19counter.models;

public class LocationState {
	private String state;
	private String country;
	private int latestTotalCases;
	private int differFromPrevDay;

	public int getDifferFromPrevDay() {
		return differFromPrevDay;
	}

	public void setDifferFromPrevDay(int differFromPrevDay) {
		this.differFromPrevDay = differFromPrevDay;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getLatestTotalCases() {
		return latestTotalCases;
	}

	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}

}
