package com.sethu.redmart.data;

public class TypesItem{
	private int count;
	private String name;
	private String uri;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
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
			"TypesItem{" + 
			"count = '" + count + '\'' + 
			",name = '" + name + '\'' + 
			",uri = '" + uri + '\'' + 
			"}";
		}
}
