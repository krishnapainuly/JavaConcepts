package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListRemoveDuplicate {
	public static void main(String args[]) {
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        List<String> unique = gamesList.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
	}
}
