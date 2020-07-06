package main.java.com.homework6.collections;

import java.util.ArrayList;

public class Fruit {

    public void findOne(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Melon");
        fruits.add("Watermelon");
        fruits.add("Orange");
        fruits.add("Apple");

        if (fruits.contains("Orange")){
            fruits.set(fruits.indexOf("Orange"),"Grapefruit");
            System.out.println(fruits);
        }
        else {
            System.out.println("There is not Orange");
        }
    }
}
