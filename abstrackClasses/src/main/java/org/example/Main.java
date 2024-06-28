package org.example;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla(); // Call instance method on instance
        womanGameCalculator.gameOver(); // Call instance method on instance

        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.hesapla(); // Polymorphic call
        gameCalculator.gameOver(); // Call base class method
    }
}
