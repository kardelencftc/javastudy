package org.example;

class CustomerManager {
    public void add() {
        System.out.println("Müşteri eklendi");
    }

    public void remove() {
        System.out.println("Müşteri silindi");
    }

    public void update() {
        System.out.println("Müşteri güncellendi");
    }
}

public class Main {
    public static void main(String[] args) {
        // Reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        // Method calls on instances
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        // Primitive type example
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2); // Output: 10

        // Array reference example
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]); // Output: 10
    }
}
