package main.java.com.homework6.collections;

import java.util.ArrayList;

public class ElementSearcher {
    ArrayList<Integer> first = new ArrayList<>();
    ArrayList<Integer> second = new ArrayList<>();

    public void fillTwoArrays() {
        first.add(2);
        first.add(7);
        first.add(6);

        second.add(2);
        second.add(1);
        second.add(7);
        second.add(10);
    }

    public void findSimular() {
        fillTwoArrays();
        first.retainAll(second);
        System.out.println("The simular data: " + first);
    }
}
