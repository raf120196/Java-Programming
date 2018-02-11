package com.epam.renat_farakhutdinov.java.lesson1.task3;

import com.epam.renat_farakhutdinov.java.lesson1.Task;

import java.util.Scanner;

/**
 * Created by Renat Farakhutdinov on 11.02.2018.
 */
public class TaskThree implements Task {
    @Override
    public void startTask() {
        Scanner in = new Scanner(System.in);
        CalculatorInterface calculator = new Calculator();

        System.out.print("Enter first number: ");
        int x = in.nextInt();
        System.out.print("Enter second number: ");
        int y = in.nextInt();

        System.out.println("\nSelect operation:");
        System.out.println("+  -  calculate amount of two numbers;");
        System.out.println("-  -  calculate subtraction of two numbers;");
        System.out.println("*  -  calculate multiplication of two numbers;");
        System.out.println("/  -  calculate division of two numbers.");

        String selection = in.next();
        switch (selection) {
            case "+":
                int result = calculator.add(x, y);
                System.out.println(String.format("Amount of %d and %d is equal to %d", x, y, result));
                break;

            case "-":
                result = calculator.subtract(x, y);
                System.out.println(String.format("Subtraction of %d and %d is equal to %d", x, y, result));
                break;

            case "*":
                result = calculator.multiply(x, y);
                System.out.println(String.format("Multiplication of %d and %d is equal to %d", x, y, result));
                break;

            case "/":
                double res = calculator.divide(x, y);
                System.out.println(String.format("Division of %d and %d is equal to %f", x, y, res));
                break;

            default:
                System.out.println("Incorrect operation!");
        }

    }
}
