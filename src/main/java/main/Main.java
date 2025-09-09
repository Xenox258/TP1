package main.java.main;

import main.java.add.Add;

public class Main {
    public static void main(String[] args) {
        Add adder = new Add();
        System.out.println(adder.add(2, 3));
    }
}