package com.sethu.redmart.data;

public class ProductLife{
	private String metric;
	private int timeIncludingDelivery;
	private boolean isMinimum;
	private int time;

	public void setMetric(String metric){
		this.metric = metric;
	}

	public String getMetric(){
		return metric;
	}

	public void setTimeIncludingDelivery(int timeIncludingDelivery){
		this.timeIncludingDelivery = timeIncludingDelivery;
	}

	public int getTimeIncludingDelivery(){
		return timeIncludingDelivery;
	}

	public void setIsMinimum(boolean isMinimum){
		this.isMinimum = isMinimum;
	}

	public boolean isIsMinimum(){
		return isMinimum;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	@Override
 	public String toString(){
		return 
			"ProductLife{" + 
			"metric = '" + metric + '\'' + 
			",time_including_delivery = '" + timeIncludingDelivery + '\'' + 
			",is_minimum = '" + isMinimum + '\'' + 
			",time = '" + time + '\'' + 
			"}";
		}
}
