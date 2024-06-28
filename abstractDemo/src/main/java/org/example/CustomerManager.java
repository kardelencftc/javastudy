// CustomerManager.java
package org.example;

public class CustomerManager {
    private MySqlDatabaseManager databaseManager;

    // CustomerManager, bir DatabaseManager türü ile başlatılmalıdır.
    public CustomerManager(MySqlDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void getCustomers() {
        databaseManager.getData();
        // Müşteri bilgilerini getirmek için ilave mantık buraya eklenebilir
    }
}
