package com.sethu.redmart.data;

public class Status{
	private String msg;
	private int code;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"msg = '" + msg + '\'' + 
			",code = '" + code + '\'' + 
			"}";
		}
}
