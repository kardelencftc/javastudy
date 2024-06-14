package org.example;

public class Main {

    public static void main(String[] args) {
        // For Döngüsü
        int i;
        for (i = 2; i < 10; i += 2) {
            // Döngü içeriği boş bırakıldı
        }
        System.out.println(i); //
        System.out.println("For Döngüsü bitti");

        // While Döngüsü
        i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü Bitti");

        // Do-While döngüsü
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 100);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
