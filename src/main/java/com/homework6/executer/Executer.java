package main.java.com.homework6.executer;

import main.java.com.homework6.collections.Divisible;
import main.java.com.homework6.collections.ElementSearcher;
import main.java.com.homework6.collections.Fruit;

public class Executer {

    Divisible deletion = new Divisible();
    Fruit fruit = new Fruit();
    ElementSearcher find = new ElementSearcher();

    public void start() {
        deletion.removeFromArray(3);
        fruit.findOne();
        find.findSimular();
    }
}
