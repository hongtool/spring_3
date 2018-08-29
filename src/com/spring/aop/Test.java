package com.spring.aop;

public  class Test {

	/**
	 * @param args add by zxx ,Dec 9, 2008
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Test().test());;
		System.out.println(new Test().test());;
	}

	static int x = 1;
	static int test()
	{
		try
		{
			return x;
		}
		finally
		{
			++x;
		}
	}
	
}

