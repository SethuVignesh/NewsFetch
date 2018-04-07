package com.sethu.redmart.data;

public class CategoriesItem{
	private String image;
	private String name;
	private int count;
	private int id;
	private String uri;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
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
			"CategoriesItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",count = '" + count + '\'' + 
			",id = '" + id + '\'' + 
			",uri = '" + uri + '\'' + 
			"}";
		}
}
