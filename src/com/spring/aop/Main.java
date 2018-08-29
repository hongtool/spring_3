package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		Computer computer = new ComputerImpl();
//		int result = computer.add(1, 2);
//		System.out.println(result);
		
//		Computer computer = new ComputerImpl2();
//		ComputerProxy proxy = new ComputerProxy(computer);
//		computer = proxy.getComputerProxy();
//		int result = computer.add(1, 2);
//		System.out.println(result);
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Computer c = (Computer) ac.getBean("computerImpl2");
		System.out.println(c.add(1, 2));
		System.out.println(c.div(8, 2));
	}
}
