package com.epam.renat_farakhutdinov.java.lesson1.task3;

/**
 * Created by Renat Farakhutdinov on 11.02.2018.
 */
public class Calculator implements CalculatorInterface {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        return a / (double) b;
    }
}
