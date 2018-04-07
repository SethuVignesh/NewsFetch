package com.sethu.redmart.data;

public class AtpLotsItem{
	private int stockStatus;
	private int qtyInStock;
	private String fromDate;
	private String toDate;
	private int qtyInCarts;

	public void setStockStatus(int stockStatus){
		this.stockStatus = stockStatus;
	}

	public int getStockStatus(){
		return stockStatus;
	}

	public void setQtyInStock(int qtyInStock){
		this.qtyInStock = qtyInStock;
	}

	public int getQtyInStock(){
		return qtyInStock;
	}

	public void setFromDate(String fromDate){
		this.fromDate = fromDate;
	}

	public String getFromDate(){
		return fromDate;
	}

	public void setToDate(String toDate){
		this.toDate = toDate;
	}

	public String getToDate(){
		return toDate;
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
			"AtpLotsItem{" + 
			"stock_status = '" + stockStatus + '\'' + 
			",qty_in_stock = '" + qtyInStock + '\'' + 
			",from_date = '" + fromDate + '\'' + 
			",to_date = '" + toDate + '\'' + 
			",qty_in_carts = '" + qtyInCarts + '\'' + 
			"}";
		}
}
