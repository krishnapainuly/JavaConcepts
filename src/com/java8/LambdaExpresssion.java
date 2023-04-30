package com.java8;

interface Drawable {
	void draw();
}

interface Sayable {
	String say(String name);
}

interface Addable {
	int add(int a, int b);
}

/**
 * lambda expression with no pram and params
 */
public class LambdaExpresssion {
	public static void main(String args[]) {
		int width = 10;
		Drawable d2 = () -> {	// no param
			System.out.println("Drawing in no Parameter: " + width);
		};
		d2.draw();
		
		Sayable sb = name -> {	// one param with return
			return "hello, " +name;
		};
		System.out.println(sb.say("Krishna "));
		
		Addable ad1 = (a,b) -> (a+b);	// two param without return keyword
		System.out.println(ad1.add(10, 20));
	}
}
