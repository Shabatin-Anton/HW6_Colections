package main.java.com.homework6.collections;

import java.util.ArrayList;

public class Divisible {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void fillArray() {
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(22);
    }

    public void removeFromArray(int x) {

        fillArray();

        arrayList.removeIf(i -> i % x == 0);
        System.out.println("Values that didn't divisible by 3: " + arrayList);
    }
}
