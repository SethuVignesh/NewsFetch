package com.sethu.redmart.data;

public class Details{
	private int prodType;
	private String storageClass;
	private double isNew;
	private String countryOfOrigin;
	private String uri;
	private int status;

	public void setProdType(int prodType){
		this.prodType = prodType;
	}

	public int getProdType(){
		return prodType;
	}

	public void setStorageClass(String storageClass){
		this.storageClass = storageClass;
	}

	public String getStorageClass(){
		return storageClass;
	}

	public void setIsNew(double isNew){
		this.isNew = isNew;
	}

	public double getIsNew(){
		return isNew;
	}

	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getCountryOfOrigin(){
		return countryOfOrigin;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Details{" + 
			"prod_type = '" + prodType + '\'' + 
			",storage_class = '" + storageClass + '\'' + 
			",is_new = '" + isNew + '\'' + 
			",country_of_origin = '" + countryOfOrigin + '\'' + 
			",uri = '" + uri + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
