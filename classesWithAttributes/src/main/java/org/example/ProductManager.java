package org.example;

public class ProductManager {
    public void add(Product product) {
        // Ürün ekleme işlemleri
        System.out.println("Ürün eklendi: " + product.getName());
    }

    public void remove(Product product) {
        // Ürün silme işlemleri
        System.out.println("Ürün silindi: " + product.getName());
    }

    public void update(Product product) {
        // Ürün güncelleme işlemleri
        System.out.println("Ürün güncellendi: " + product.getName());
    }
}
