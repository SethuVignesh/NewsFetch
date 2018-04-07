package com.sethu.redmart.data;

public class Pricing{
	private int savingsType;
	private double price;
	private double promoPrice;
	private int onSale;

	public void setSavingsType(int savingsType){
		this.savingsType = savingsType;
	}

	public int getSavingsType(){
		return savingsType;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setPromoPrice(double promoPrice){
		this.promoPrice = promoPrice;
	}

	public double getPromoPrice(){
		return promoPrice;
	}

	public void setOnSale(int onSale){
		this.onSale = onSale;
	}

	public int getOnSale(){
		return onSale;
	}

	@Override
 	public String toString(){
		return 
			"Pricing{" + 
			"savings_type = '" + savingsType + '\'' + 
			",price = '" + price + '\'' + 
			",promo_price = '" + promoPrice + '\'' + 
			",on_sale = '" + onSale + '\'' + 
			"}";
		}
}
