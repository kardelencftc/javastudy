package org.example;

public class Main {
    public static void main(String[] args) {
        // Product nesnesi oluşturma ve değer atama
        Product product1 = new Product(1, "Laptop", "16GB RAM, 512GB SSD", 1500.0, 10, "Siyah");

        // ProductManager nesnesi oluşturma
        ProductManager productManager = new ProductManager();

        // Ürün ekleme
        productManager.add(product1);

        // Ürün güncelleme
        product1.setPrice(1400.0);
        productManager.update(product1);

        // Ürün silme
        productManager.remove(product1);
    }
}
