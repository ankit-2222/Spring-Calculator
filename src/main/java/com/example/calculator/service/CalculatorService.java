package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            case "/" -> {
                if (num2 == 0) throw new ArithmeticException("Division by zero");
                return num1 / num2;
            }
            default -> throw new IllegalArgumentException("Invalid operation");
        }
    }
}
