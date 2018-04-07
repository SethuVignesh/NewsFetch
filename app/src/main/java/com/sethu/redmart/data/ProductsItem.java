package com.sethu.redmart.data;

import java.util.List;

public class ProductsItem{
	private List<Integer> types;
	private Img img;
	private List<ImagesItem> images;
	private DescriptionFields descriptionFields;
	private int pr;
	private List<String> categoryTags;
	private Filters filters;
	private String title;
	private Warehouse warehouse;
	private Inventory inventory;
	private Measure measure;
	private ProductLife productLife;
	private Details details;
	private Attributes attributes;
	private int id;
	private List<Integer> categories;
	private String sku;
	private int maxDaysOnShelf;
	private Pricing pricing;
	private String desc;

	public void setTypes(List<Integer> types){
		this.types = types;
	}

	public List<Integer> getTypes(){
		return types;
	}

	public void setImg(Img img){
		this.img = img;
	}

	public Img getImg(){
		return img;
	}

	public void setImages(List<ImagesItem> images){
		this.images = images;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public void setDescriptionFields(DescriptionFields descriptionFields){
		this.descriptionFields = descriptionFields;
	}

	public DescriptionFields getDescriptionFields(){
		return descriptionFields;
	}

	public void setPr(int pr){
		this.pr = pr;
	}

	public int getPr(){
		return pr;
	}

	public void setCategoryTags(List<String> categoryTags){
		this.categoryTags = categoryTags;
	}

	public List<String> getCategoryTags(){
		return categoryTags;
	}

	public void setFilters(Filters filters){
		this.filters = filters;
	}

	public Filters getFilters(){
		return filters;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setWarehouse(Warehouse warehouse){
		this.warehouse = warehouse;
	}

	public Warehouse getWarehouse(){
		return warehouse;
	}

	public void setInventory(Inventory inventory){
		this.inventory = inventory;
	}

	public Inventory getInventory(){
		return inventory;
	}

	public void setMeasure(Measure measure){
		this.measure = measure;
	}

	public Measure getMeasure(){
		return measure;
	}

	public void setProductLife(ProductLife productLife){
		this.productLife = productLife;
	}

	public ProductLife getProductLife(){
		return productLife;
	}

	public void setDetails(Details details){
		this.details = details;
	}

	public Details getDetails(){
		return details;
	}

	public void setAttributes(Attributes attributes){
		this.attributes = attributes;
	}

	public Attributes getAttributes(){
		return attributes;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategories(List<Integer> categories){
		this.categories = categories;
	}

	public List<Integer> getCategories(){
		return categories;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setMaxDaysOnShelf(int maxDaysOnShelf){
		this.maxDaysOnShelf = maxDaysOnShelf;
	}

	public int getMaxDaysOnShelf(){
		return maxDaysOnShelf;
	}

	public void setPricing(Pricing pricing){
		this.pricing = pricing;
	}

	public Pricing getPricing(){
		return pricing;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	@Override
 	public String toString(){
		return 
			"ProductsItem{" + 
			"types = '" + types + '\'' + 
			",img = '" + img + '\'' + 
			",images = '" + images + '\'' + 
			",description_fields = '" + descriptionFields + '\'' + 
			",pr = '" + pr + '\'' + 
			",category_tags = '" + categoryTags + '\'' + 
			",filters = '" + filters + '\'' + 
			",title = '" + title + '\'' + 
			",warehouse = '" + warehouse + '\'' + 
			",inventory = '" + inventory + '\'' + 
			",measure = '" + measure + '\'' + 
			",product_life = '" + productLife + '\'' + 
			",details = '" + details + '\'' + 
			",attributes = '" + attributes + '\'' + 
			",id = '" + id + '\'' + 
			",categories = '" + categories + '\'' + 
			",sku = '" + sku + '\'' + 
			",max_days_on_shelf = '" + maxDaysOnShelf + '\'' + 
			",pricing = '" + pricing + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}