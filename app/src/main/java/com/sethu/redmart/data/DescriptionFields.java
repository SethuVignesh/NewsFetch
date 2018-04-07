package com.sethu.redmart.data;

import java.util.List;

public class DescriptionFields{
	private List<SecondaryItem> secondary;
	private List<PrimaryItem> primary;

	public void setSecondary(List<SecondaryItem> secondary){
		this.secondary = secondary;
	}

	public List<SecondaryItem> getSecondary(){
		return secondary;
	}

	public void setPrimary(List<PrimaryItem> primary){
		this.primary = primary;
	}

	public List<PrimaryItem> getPrimary(){
		return primary;
	}

	@Override
 	public String toString(){
		return 
			"DescriptionFields{" + 
			"secondary = '" + secondary + '\'' + 
			",primary = '" + primary + '\'' + 
			"}";
		}
}