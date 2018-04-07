package com.sethu.redmart.data;

import java.util.List;

public class Attributes{
	private List<Object> dag;

	public void setDag(List<Object> dag){
		this.dag = dag;
	}

	public List<Object> getDag(){
		return dag;
	}

	@Override
 	public String toString(){
		return 
			"Attributes{" + 
			"dag = '" + dag + '\'' + 
			"}";
		}
}