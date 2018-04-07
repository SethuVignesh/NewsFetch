package com.sethu.redmart.data;

public class TogglesItem{
	private String name;
	private String uri;

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
			"TogglesItem{" + 
			"name = '" + name + '\'' + 
			",uri = '" + uri + '\'' + 
			"}";
		}
}
