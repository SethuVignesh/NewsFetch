package com.sethu.redmart.data;

public class Measure{
	private String volMetric;
	private double W;
	private double H;
	private double L;
	private double wt;
	private String wtMetric;

	public void setVolMetric(String volMetric){
		this.volMetric = volMetric;
	}

	public String getVolMetric(){
		return volMetric;
	}

	public void setW(double W){
		this.W = W;
	}

	public double getW(){
		return W;
	}

	public void setH(double H){
		this.H = H;
	}

	public double getH(){
		return H;
	}

	public void setL(double L){
		this.L = L;
	}

	public double getL(){
		return L;
	}

	public void setWt(double wt){
		this.wt = wt;
	}

	public double getWt(){
		return wt;
	}

	public void setWtMetric(String wtMetric){
		this.wtMetric = wtMetric;
	}

	public String getWtMetric(){
		return wtMetric;
	}

	@Override
 	public String toString(){
		return 
			"Measure{" + 
			"vol_metric = '" + volMetric + '\'' + 
			",w = '" + W + '\'' + 
			",h = '" + H + '\'' + 
			",l = '" + L + '\'' + 
			",wt = '" + wt + '\'' + 
			",wt_metric = '" + wtMetric + '\'' + 
			"}";
		}
}
