package com.spring.aop;

public class Main {

	public static void main(String[] args) {
//		Computer computer = new ComputerImpl();
//		int result = computer.add(1, 2);
//		System.out.println(result);
		
		Computer computer = new ComputerImpl2();
		ComputerProxy proxy = new ComputerProxy(computer);
		computer = proxy.getComputerProxy();
		int result = computer.add(1, 2);
		System.out.println(result);
	}
}
