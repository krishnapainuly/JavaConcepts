package com.java8;

@FunctionalInterface
interface Interface1 {

	void method1(String str);
	
	default void print(String str){
		System.out.println("Printing "+str);
	}
	static void log(String str){
		System.out.println("log in interface 1 "+str);
	}
}
@FunctionalInterface
interface Interface2 {

	void method2(String str);
	
	default void print(String str){
		System.out.println("Printing "+str);
	}
	static void log(String str){
		System.out.println("log in interface 2 "+str);
	}
}

public class DefaultStaticInterface implements Interface1, Interface2{

	@Override
	public void method2(String str) {
		System.out.println("Method2...");
	}

	@Override
	public void method1(String str) {
		System.out.println("Method1...");
	}

	@Override
	public void print(String str) {
		Interface2.super.print(str);
	}

}
