package com.example.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.calculator.service.CalculatorService;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("num1", "");
        model.addAttribute("num2", "");
        model.addAttribute("operation", "");
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam(required = false) String num1,
            @RequestParam(required = false) String num2,
            @RequestParam(required = false) String operation,
            Model model) {
        try {
            if (num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty() || operation == null || operation.isEmpty()) {
                model.addAttribute("error", "Please enter both numbers and select an operation.");
            } else {
                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);
                double result = calculatorService.calculate(n1, n2, operation);

                model.addAttribute("num1", num1);
                model.addAttribute("num2", num2);
                model.addAttribute("operation", operation);
                model.addAttribute("result", result);
            }
        } catch (Exception e) {
            model.addAttribute("error", "Invalid input");
            model.addAttribute("num1", num1);
            model.addAttribute("num2", num2);
            model.addAttribute("operation", operation);
        }
        return "calculator";
    }
}
