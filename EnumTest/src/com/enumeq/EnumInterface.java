package com.enumeq;

import com.interfaces.EnumSuper;

public enum EnumInterface implements  EnumSuper{
	SHENTONG(1,"ÉêÍ¨"),EMS(2,"EMS"),GUOTONG(3,"¹úÍ¨");

	private int id;
	private String name;
	
	private EnumInterface(int id, String name){
		this.setId(id);
		this.setName(name);
	}
	@Override
	public void print() {
		System.out.println(this.id + "   " +this.name);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
