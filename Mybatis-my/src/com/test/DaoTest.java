package com.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.dao.ActorDao;
import com.daoImpl.ActorDaoImpl;
import com.proxy.CglibProxy;
import com.proxy.DaoProxy;

public class DaoTest {

	@Test
	public void queryActor(){
		ActorDao actorDao = new ActorDaoImpl();
		List<Map<String, Object>> maps = actorDao.queryActory();
		System.out.println(maps);
	}
	
	@Test
	public void Test(){
		ActorDao actorDao = new ActorDaoImpl();
		Map<String, Object> map = actorDao.test();
		System.out.println(JSONObject.toJSON(map));
	}
	
	@Test
	public void testProxy(){
		final ActorDaoImpl daoImpl = new ActorDaoImpl();
		Object object = Proxy.newProxyInstance(daoImpl.getClass().getClassLoader(), daoImpl.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				System.out.println("动态代理开始");
				method.invoke(daoImpl, args);
				System.out.println("动态代理结束");
				return null;
			}
		});
		ActorDao a = (ActorDao) object;
		a.proxyTest();
	}
	
	@Test
	public void cglibProxy(){
		CglibProxy cProxy = new CglibProxy();
		ActorDaoImpl aImpl = (ActorDaoImpl)cProxy.getProxy(new ActorDaoImpl().getClass());
		aImpl.proxyTest();
	}
	
	
	@Test
	public void proxyTest(){
		DaoProxy daoProxy = new DaoProxy();
		ActorDao actorDao = daoProxy.bind(new ActorDaoImpl());
		actorDao.proxyTest();
	}
	
	@Test
	public void genericErased() throws Exception{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.getClass().getMethod("add", Object.class).invoke(list, "a");
		list.getClass().getMethod("add", Object.class).invoke(list, "b");
		list.getClass().getMethod("add", Object.class).invoke(list, "c");
		for (int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	@Test
	public void arrayGeneric(){
		rew<String>[] r = new rew[10];
		String string[] = new String[10];
		Date[] dates = new Date[10];
		Map<String, Integer>[] maps = new HashMap[10];
		maps[0] = new HashMap<>();
	}
	
	class rew<T>{
		
	}
	
	
	@Test
	public void genericObject(){
		//泛型在于引用发挥作用，而不是对象发挥作用
		List l = new ArrayList<Integer>();
		l.add("fdsf");
		System.out.println(l.get(0));
//		System.out.println(new ArrayList<Integer>().add("132456"));
	}
	
	
	
	
}
