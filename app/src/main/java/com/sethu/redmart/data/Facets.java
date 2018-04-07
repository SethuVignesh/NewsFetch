package com.sethu.redmart.data;

import java.util.List;

public class Facets{
	private List<CategoriesItem> categories;

	public void setCategories(List<CategoriesItem> categories){
		this.categories = categories;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}

	@Override
 	public String toString(){
		return 
			"Facets{" + 
			"categories = '" + categories + '\'' + 
			"}";
		}
}