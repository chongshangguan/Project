package com.test;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.internal.MethodSorter;

import com.annotation.Fruit;
import com.realclass.AnnotationClass;

public class AnnotationTest {

	@Test
	public void test1() throws Exception{
		AnnotationClass aClass = new AnnotationClass();
		detectionAnnotation(aClass.getClass());
	}
	
	private void detectionAnnotation(Class<?> class1) throws Exception{
		Method methods = class1.getMethod("print", null);
		if (methods.isAnnotationPresent(Fruit.class)) {
			Fruit fruit = methods.getAnnotation(Fruit.class);
			System.out.println(fruit.name());
		}
	}
}
