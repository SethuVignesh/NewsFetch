package com.sethu.redmart.data;

public class Img{
	private int W;
	private int H;
	private String name;
	private int position;

	public void setW(int W){
		this.W = W;
	}

	public int getW(){
		return W;
	}

	public void setH(int H){
		this.H = H;
	}

	public int getH(){
		return H;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getPosition(){
		return position;
	}

	@Override
 	public String toString(){
		return 
			"Img{" + 
			"w = '" + W + '\'' + 
			",h = '" + H + '\'' + 
			",name = '" + name + '\'' + 
			",position = '" + position + '\'' + 
			"}";
		}
}
