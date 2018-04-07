package com.sethu.redmart.data;

import java.util.List;

public class Inventory{
	private int stockType;
	private int maxSaleQty;
	private int atpStatus;
	private int qtyInStock;
	private int stockStatus;
	private List<AtpLotsItem> atpLots;
	private String nextAvailableDate;
	private int limitedStockStatus;
	private int qtyInCarts;

	public void setStockType(int stockType){
		this.stockType = stockType;
	}

	public int getStockType(){
		return stockType;
	}

	public void setMaxSaleQty(int maxSaleQty){
		this.maxSaleQty = maxSaleQty;
	}

	public int getMaxSaleQty(){
		return maxSaleQty;
	}

	public void setAtpStatus(int atpStatus){
		this.atpStatus = atpStatus;
	}

	public int getAtpStatus(){
		return atpStatus;
	}

	public void setQtyInStock(int qtyInStock){
		this.qtyInStock = qtyInStock;
	}

	public int getQtyInStock(){
		return qtyInStock;
	}

	public void setStockStatus(int stockStatus){
		this.stockStatus = stockStatus;
	}

	public int getStockStatus(){
		return stockStatus;
	}

	public void setAtpLots(List<AtpLotsItem> atpLots){
		this.atpLots = atpLots;
	}

	public List<AtpLotsItem> getAtpLots(){
		return atpLots;
	}

	public void setNextAvailableDate(String nextAvailableDate){
		this.nextAvailableDate = nextAvailableDate;
	}

	public String getNextAvailableDate(){
		return nextAvailableDate;
	}

	public void setLimitedStockStatus(int limitedStockStatus){
		this.limitedStockStatus = limitedStockStatus;
	}

	public int getLimitedStockStatus(){
		return limitedStockStatus;
	}

	public void setQtyInCarts(int qtyInCarts){
		this.qtyInCarts = qtyInCarts;
	}

	public int getQtyInCarts(){
		return qtyInCarts;
	}

	@Override
 	public String toString(){
		return 
			"Inventory{" + 
			"stock_type = '" + stockType + '\'' + 
			",max_sale_qty = '" + maxSaleQty + '\'' + 
			",atp_status = '" + atpStatus + '\'' + 
			",qty_in_stock = '" + qtyInStock + '\'' + 
			",stock_status = '" + stockStatus + '\'' + 
			",atp_lots = '" + atpLots + '\'' + 
			",next_available_date = '" + nextAvailableDate + '\'' + 
			",limited_stock_status = '" + limitedStockStatus + '\'' + 
			",qty_in_carts = '" + qtyInCarts + '\'' + 
			"}";
		}
}