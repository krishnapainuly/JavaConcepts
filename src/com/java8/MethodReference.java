package com.java8;

import java.util.function.BiFunction;

/**
 * Method reference with, static method, instance method & constructor
 */
public class MethodReference {
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }
    public static void main(String args[]) {
    	// predefined functional interface Runnable to refer static method
	    Thread t = new Thread(MethodReference::ThreadStatus);
	    t.start();

	    // BiFunction interface and using it's apply() method, refer static method
	    BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
	    System.out.println(adder.apply(10, 20));

	    // Refer to an instance method
	    Sayable1 say = new MethodReference()::saySomething;
	    say.say();
	    
	    // Refere to a constructor
	    Messageable mr = Message::new;
	    mr.getMessage("Hello");
    }
}

class Arithmetic{  
	public static int add(int a, int b){  
		return a+b;  
	}
}
interface Sayable1 {
	void say();
}
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg +" in Message Class");  
    }  
}  