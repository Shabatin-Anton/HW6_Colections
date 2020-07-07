package main.java.com.homework6.collections;

import java.util.ArrayList;

public class Fruit {
    ArrayList<String> fruits = new ArrayList<>();

    public void fillFrutsArray() {
        fruits.add("Mango");
        fruits.add("Melon");
        fruits.add("Watermelon");
        fruits.add("Nuts");
        fruits.add("Orange");

        System.out.println("ArrayList before replace: " + fruits);
    }

    public void findOne() {

        fillFrutsArray();

        if (fruits.contains("Orange")) {
            fruits.set(fruits.indexOf("Orange"), "Grapefruit");
            System.out.println(fruits);
        } else {
            System.out.println("There is not Orange");
        }
    }
}
