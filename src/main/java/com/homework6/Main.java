package main.java.com.homework6;

import main.java.com.homework6.collections.Divisible;
import main.java.com.homework6.collections.FindElement;
import main.java.com.homework6.collections.Fruit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Divisible deletion = new Divisible();
        deletion.removeFromArray();

        Fruit fruit = new Fruit();
        fruit.findOne();

        FindElement find = new FindElement();
        find.findInArray();
    }
}
