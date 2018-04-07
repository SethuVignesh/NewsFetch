package com.sethu.redmart.data;

import java.util.List;

public class OptionsItem{
	private List<TypesItem> types;
	private String name;
	private String uri;

	public void setTypes(List<TypesItem> types){
		this.types = types;
	}

	public List<TypesItem> getTypes(){
		return types;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	@Override
 	public String toString(){
		return 
			"OptionsItem{" + 
			"types = '" + types + '\'' + 
			",name = '" + name + '\'' + 
			",uri = '" + uri + '\'' + 
			"}";
		}
}