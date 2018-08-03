package com.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler;

import org.omg.CORBA.portable.InvokeHandler;

public class ComputerProxy {

	private Computer computer;
	
	public ComputerProxy(Computer computer) {
		this.computer = computer;
	}
	
	public Computer getComputerProxy() {
		//类加载器
		ClassLoader loader = Computer.class.getClassLoader();
		//代理对象
		Class[] interfaces = {Computer.class};
		//代理的核心控制器
		InvocationHandler h = new InvocationHandler() {
			//proxy:代理对象
			//method:被代理对象当中的方法
			//args:方法参数
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("开始执行" + method.getName());
				Object o = method.invoke(computer, args);
				System.out.println("执行完毕" + method.getName());
				return o;
			}
		};
		Computer c = (Computer) Proxy.newProxyInstance(loader, interfaces, h);
		return c;
	}
}
