package com.epam.autumn.politech.ht10.structural.proxy;

public class LogLoader {
    public static void main(String[] args) {
        LogFile logFile = new ProxyLogFile(345);
        logFile.load();
    }
}
