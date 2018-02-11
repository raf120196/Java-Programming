package com.epam.renat_farakhutdinov.java.lesson1.task2;

import com.epam.renat_farakhutdinov.java.lesson1.Task;

/**
 * Created by Renat Farakhutdinov on 10.02.2018.
 */
public class TaskTwo implements Task {
    @Override
    public void startTask() {
        System.out.println("Task 2.1");
        StringProcessor.getShortestAndLongestStringInList();

        System.out.println("\nTask 2.2");
        StringProcessor.getStringWithLengthMoreAverage();

        System.out.println("\nTask 2.3");
        StringProcessor.getStringWithLengthLessAverage();

        System.out.println("\nTask 2.4");
        StringProcessor.getWordWithMinimalDifferentSymbols();

        System.out.println("\nTask 2.5");
        StringProcessor.getWordWithoutRepetitiveSymbols();

        System.out.println("\nTask 2.6");
        StringProcessor.getWordThatContainsOnlyDigits();
    }
}
