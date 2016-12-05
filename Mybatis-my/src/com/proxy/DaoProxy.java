package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.dao.ActorDao;

public class DaoProxy implements InvocationHandler {
	private ActorDao t;
	
	public ActorDao bind(ActorDao t){
		this.t = t;
		Object object = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), this);
		if (object instanceof ActorDao) {
			return (ActorDao)object;
		}
		return null;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("代理开始");
		method.invoke(t, args);
		System.out.println("代理结束");
		return null;
	}

}
