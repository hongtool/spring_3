package com.spring.aop;

public class ComputerImpl implements Computer {

	@Override
	public int add(int a, int b) {
		System.out.println("add开始执行，操作数为" + a + "\t" + b);
		int result = a + b;
		System.out.println("add执行完毕，操作数为" + a + "\t" + b);
		return result;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("sub开始执行，操作数为" + a + "\t" + b);
		int result = a - b;
		System.out.println("sub执行完毕，操作数为" + a + "\t" + b);
		return result;
	}

	@Override
	public int mul(int a, int b) {
		System.out.println("mul开始执行，操作数为" + a + "\t" + b);
		int result = a * b;
		System.out.println("mul执行完毕，操作数为" + a + "\t" + b);
		return result;
	}

	@Override
	public int div(int a, int b) {
		System.out.println("div开始执行，操作数为" + a + "\t" + b);
		int result = a / b;
		System.out.println("div执行完毕，操作数为" + a + "\t" + b);
		return result;
	}

}
