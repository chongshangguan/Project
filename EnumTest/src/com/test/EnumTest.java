package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.enumeq.Constant;
import com.enumeq.EnumAdd;
import com.enumeq.EnumInterface;
import com.interfaces.InterfaceAndEnum.Food;

public class EnumTest {

	@Test
	public void constant() {
		System.out.println(Constant.RED);
	}
	
	@Test
	public void switchEnum(){
		Constant constant = Constant.BLANK;
		switch (constant) {
			case RED: System.out.println("red");break;
			case WHITE: System.out.println("WHITE");break;
			case BLANK: System.out.println("BLANK");break;
			default:System.out.println("no");break;
		}
	}
	
	@Test
	public void testEnumAdd(){
		EnumAdd enumAdd = EnumAdd.RED;
		System.out.println(enumAdd.getId());
		enumAdd.setId(10);
		System.out.println(enumAdd.getId());
		enumAdd = enumAdd.RED;
		System.out.println(enumAdd.getName());
		System.out.println(enumAdd.getId());
		enumAdd.setName("what");
		System.out.println(enumAdd.getName());
	}
	
	@Test
	public void  testEnumChange(){
		EnumAdd enumAdd = EnumAdd.RED;
		System.out.println(enumAdd.getId());
	}
	
	@Test
	public void testEnumInterface(){
		EnumInterface eInterface = EnumInterface.SHENTONG;
		eInterface.print();
	}
	
	@Test
	public void testInterfaceAndEnum(){
		Food food = Food.SHUCAI;
		
	}

}
