package com.java8;
import java.util.*;
import java.util.stream.Collectors;  

public class StreamsAPI {
	public static void main(String args[]) {
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // filter data of list
        // add price to productPriceList
        // display data
        List<Float> prodPriceList = productsList.stream().filter( p -> p.price > 30000)
        		.map(p -> p.price)
        		.collect(Collectors.toList());
        System.out.println(prodPriceList);
        // reduce
        Float totalPrice = productsList.stream().map(p -> p.price ).reduce(0.0f, (sum, price) -> sum +price);
        System.out.println("Total price = " +totalPrice);
        // find max
        Product prod = productsList.stream().max((p1, p2) -> p1.price > p2.price ? 1: -1).get();
        System.out.println("Max price = " +prod.price);
        // count method
        float count  = productsList.stream().filter( p -> p.price > 30000).count();
        System.out.println( "Count method = " + count);
        // convert list to map
        Map<Integer, String> myMap = productsList.stream().collect(Collectors.toMap(p -> p.id,  p->p.name));
        System.out.println(myMap);
	}
}
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  