package com.ncist.edu.crm.pojo;

public class BarStyle {
	private String[] xAxisDate;
	private int[] seriesDate;
	public String[] getxAxisDate() {
		return xAxisDate;
	}
	public void setxAxisDate(String[] xAxisDate) {
		this.xAxisDate = xAxisDate;
	}
	public int[] getSeriesDate() {
		return seriesDate;
	}
	public void setSeriesDate(int[] seriesDate) {
		this.seriesDate = seriesDate;
	}
	public BarStyle(String[] xAxisDate, int[] seriesDate) {
		super();
		this.xAxisDate = xAxisDate;
		this.seriesDate = seriesDate;
	}
	
	
	
}
