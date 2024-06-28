// Main.java
package org.example;

public class Main {
    public static void main(String[] args) {
        // Bir CustomerManager nesnesi, bir DatabaseManager türü ile başlatılmalıdır.
        CustomerManager customerManager = new CustomerManager(new MySqlDatabaseManager());
        customerManager.getCustomers();
    }
}
