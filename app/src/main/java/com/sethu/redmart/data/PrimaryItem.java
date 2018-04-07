package com.sethu.redmart.data;

public class PrimaryItem{
	private String name;
	private String content;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"PrimaryItem{" + 
			"name = '" + name + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}
