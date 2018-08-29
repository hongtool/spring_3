package com.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ComputerAspect {

	@Before(value = "execution(public int com.spring.aop.ComputerImpl2.*(..))")
	public void before(JoinPoint jp) {
		//获取方法的参数列表
		Object[] args = jp.getArgs();
		//获取方法名
		String methodName = jp.getSignature().getName();
		System.out.println("run a way before "+methodName+" and the parameter is " 
		+ Arrays.asList(args));
	}
	
	@After(value = "execution(public int com.spring.aop.ComputerImpl2.*(..))")
	public void after(JoinPoint jp) {
		Object[] args = jp.getArgs();
		String methodName = jp.getSignature().getName();
		System.out.println("run a way after "+methodName+" and the parameter is " 
				+ Arrays.asList(args));
	}
	
	@AfterReturning(value = "execution(* *.*(..))")
	public void afterTrue(JoinPoint jp) {
		Object[] args = jp.getArgs();
		String methodName = jp.getSignature().getName();
		System.out.println("run a way after the "+methodName+" true and the parameter is " 
				+ Arrays.asList(args));
	}
}
