package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String args[]) {
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");
        gamesList.forEach(game -> System.out.println(game));
        
	}
}
