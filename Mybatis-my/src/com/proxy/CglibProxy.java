package com.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

	private Enhancer en = new Enhancer();
	public Object getProxy(Class class1){
		en.setSuperclass(class1);
		en.setCallback(this);
		return en.create();
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("cglib��ʼ");
		Object object = arg3.invokeSuper(arg0, arg2);
		System.out.println("cglib����");
		return object;
	}

	
}
