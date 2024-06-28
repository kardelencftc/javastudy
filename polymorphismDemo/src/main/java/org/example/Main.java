package org.example;

public class Main {
    public static void main(String[] args) {
        // FileLogger nesnesini başlatın ve initialize edin
        FileLogger fileLogger = new FileLogger();

        // CustomerManager'ı FileLogger ile başlatın
        CustomerManager customerManager = new CustomerManager(fileLogger);
        customerManager.add();
    }
}
