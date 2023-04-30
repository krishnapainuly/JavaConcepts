package com.java8;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String[] str = new String[10];
//		String lowercaseString = str[5].toLowerCase();
//        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index
//		System.out.print(lowercaseString);
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {		// check for value is present or not
			String lowerString = str[5].toLowerCase();
			System.out.println(lowerString);
		}else {
			System.out.println("String value not present");
		}

		str[5] = "Java optional class example";
		Optional<String> checkNull1 = Optional.ofNullable(str[5]);
		if(checkNull1.isPresent()) {		// check for value is present or not
			String lowerString = str[5].toLowerCase();
			System.out.println(lowerString);
		}else {
			System.out.println("String value not present");
		}
		checkNull.ifPresent(System.out::println);
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> value = Optional.of(str[5]);
		System.out.println("Getting value: " + value.get());
		System.out.println("Getting hashcode: " + value.hashCode());
		System.out.println("is value present: " + value.isPresent());
		System.out.println("Nullable optional: "+ Optional.ofNullable(str[5]));
		System.out.println("orElse: " +value.orElse("Value not present, or else "));
		System.out.println("orElse: " +empty.orElse("Value not present, empty "));
	}
}
