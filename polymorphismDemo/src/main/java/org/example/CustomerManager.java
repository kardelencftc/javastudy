package org.example;

public class CustomerManager {
    private FileLogger logger;

    // Yapıcı metod
    public CustomerManager(FileLogger logger) {
        this.logger = logger; // logger nesnesini burada atanmalı
    }

    public void add() {
        System.out.println("Müşteri eklendi");
        if (logger != null) {
            logger.log("log mesajı");
        } else {
            System.err.println("Logger nesnesi null olduğu için loglama yapılamadı.");
        }
    }
}
