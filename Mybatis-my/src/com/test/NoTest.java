package com.test;

import org.junit.Test;

public class NoTest {

	@Test
	public void systemTest(){
		long time = System.nanoTime();
//		System.out.println(System.getProperty("java.version"));
//		System.out.println(System.getProperty("java.vendor"));
//		System.out.println(System.getProperty("java.vendor.url"));
//		System.out.println(System.getProperty("java.home"));
//		System.out.println();
//		System.out.println(System.getProperty("java.vm.specification.version"));
//		System.out.println(System.getProperty("java.vm.specification.vendor"));
//		System.out.println(System.getProperty("java.vm.specification.name"));
//		System.out.println(System.getProperty("java.vm.version"));
//		System.out.println(System.getProperty("java.vm.vendor"));
//		System.out.println(System.getProperty("java.vm.name"));
//		System.out.println();
//		System.out.println(System.getProperty("java.specification.version"));
//		System.out.println(System.getProperty("java.specification.vendor"));
//		System.out.println(System.getProperty("java.specification.name"));
//		System.err.println("---------------------------");
//		System.out.println(System.getenv());
//		System.out.println(System.getProperty("java.class.version"));
//		System.out.println(System.getProperty("java.class.path"));
//		System.out.println(System.getProperty("java.library.path"));
//		System.out.println(System.getProperty("java.io.tmpdir"));
//		System.out.println(System.getProperty("java.compiler"));
		System.out.println();
//		System.out.println(System.getProperty("java.ext.dirs"));
//		System.err.println("---------------------------");
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("os.arch"));
//		System.out.println(System.getProperty("os.version"));
//		System.out.println();
//		System.out.println(System.getProperty("file.separator"));
//		System.out.println(System.getProperty("path.separator"));
//		System.out.println(System.getProperty("line.separator"));
//		System.out.println();
//		System.out.println(System.getProperty("user.name"));
//		System.out.println(System.getProperty("user.home"));
//		System.out.println(System.getProperty("user.dir"));
//		System.out.println(System.nanoTime() -time);
		System.out.println(System.getSecurityManager());
	}
	
	@Test
	public void testArrayLength(){
		String[] strings = new String[100000];
		for(int i=0;i<100000;i++){
			strings[i] = String.valueOf(i);
		}
	}
}
