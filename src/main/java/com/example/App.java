package com.example.ProjectA;

import com.example.ProjectB.LoggerService;

public class App {
    public static void main(String[] args) {
        LoggerService loggerService = new LoggerService();
        loggerService.logMessage("Hello from Project A!");
    }
}
