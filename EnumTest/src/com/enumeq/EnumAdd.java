package com.enumeq;

public enum EnumAdd {

	RED(1,"��ɫ"),WHITE(2,"��ɫ"),BLACK(3,"��ɫ");
	private int id;
	private String name;
	
	private EnumAdd(int id,String name){
		this.setId(id);
		this.setName(name);
	}
	
	public void instance(int id,String name) {
	
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
