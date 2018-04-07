package com.sethu.redmart.data;

public class Filters{
	private String mfrName;
	private int trendingFrequency;
	private int isOrganic;
	private String countryOfOrigin;
	private String vendorName;
	private String brandName;
	private String brandUri;
	private int frequency;
	private String festiveBbq;
	private String potluck;

	public void setMfrName(String mfrName){
		this.mfrName = mfrName;
	}

	public String getMfrName(){
		return mfrName;
	}

	public void setTrendingFrequency(int trendingFrequency){
		this.trendingFrequency = trendingFrequency;
	}

	public int getTrendingFrequency(){
		return trendingFrequency;
	}

	public void setIsOrganic(int isOrganic){
		this.isOrganic = isOrganic;
	}

	public int getIsOrganic(){
		return isOrganic;
	}

	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getCountryOfOrigin(){
		return countryOfOrigin;
	}

	public void setVendorName(String vendorName){
		this.vendorName = vendorName;
	}

	public String getVendorName(){
		return vendorName;
	}

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setBrandUri(String brandUri){
		this.brandUri = brandUri;
	}

	public String getBrandUri(){
		return brandUri;
	}

	public void setFrequency(int frequency){
		this.frequency = frequency;
	}

	public int getFrequency(){
		return frequency;
	}

	public void setFestiveBbq(String festiveBbq){
		this.festiveBbq = festiveBbq;
	}

	public String getFestiveBbq(){
		return festiveBbq;
	}

	public void setPotluck(String potluck){
		this.potluck = potluck;
	}

	public String getPotluck(){
		return potluck;
	}

	@Override
 	public String toString(){
		return 
			"Filters{" + 
			"mfr_name = '" + mfrName + '\'' + 
			",trending_frequency = '" + trendingFrequency + '\'' + 
			",is_organic = '" + isOrganic + '\'' + 
			",country_of_origin = '" + countryOfOrigin + '\'' + 
			",vendor_name = '" + vendorName + '\'' + 
			",brand_name = '" + brandName + '\'' + 
			",brand_uri = '" + brandUri + '\'' + 
			",frequency = '" + frequency + '\'' + 
			",festive_bbq = '" + festiveBbq + '\'' + 
			",potluck = '" + potluck + '\'' + 
			"}";
		}
}
