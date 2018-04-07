package com.sethu.redmart.data;

public class Warehouse{
	private Measure measure;

	public void setMeasure(Measure measure){
		this.measure = measure;
	}

	public Measure getMeasure(){
		return measure;
	}

	@Override
 	public String toString(){
		return 
			"Warehouse{" + 
			"measure = '" + measure + '\'' + 
			"}";
		}
}
