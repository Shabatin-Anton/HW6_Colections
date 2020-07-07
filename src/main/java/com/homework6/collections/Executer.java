package main.java.com.homework6.collections;

public class Executer {

    Divisible deletion = new Divisible();
    Fruit fruit = new Fruit();
    ElementSearcher find = new ElementSearcher();

    public void start() {
        deletion.removeFromArray();
        fruit.findOne();
        find.findSimular();
    }
}
