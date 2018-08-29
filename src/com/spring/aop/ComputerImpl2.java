package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class ComputerImpl2 implements Computer {

	@Override
	public int add(int a, int b) {
		int result = a + b;
		System.out.println("run of add()");
		return result;
	}

	@Override
	public int sub(int a, int b) {
		int result = a - b;
		return result;
	}

	@Override
	public int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	public int div(int a, int b) {
		int result = a / b;
		return result;
	}

}
