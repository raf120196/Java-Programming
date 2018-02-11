package com.epam.renat_farakhutdinov.java.lesson1.task1;

import com.epam.renat_farakhutdinov.java.lesson1.Task;

/**
 * Created by Renat Farakhutdinov on 10.02.2018.
 */
public class TaskOne implements Task {
    @Override
    public void startTask() {
        System.out.println("Task 1.1");
        Array array1 = new Array(20, -20, 20);
        System.out.println("Source array: " + array1.toString());
        array1.swapMaxNegativeWithMinPositive();
        System.out.println("Processed array: " + array1.toString());

        System.out.println("\nTask 1.2");
        array1 = new Array(20, -20, 20);
        System.out.println("Source array: " + array1.toString());
        System.out.println("Amount of elements on even positions = " + array1.getSummaOfEvenPositionElements());

        System.out.println("\nTask 1.3");
        array1 = new Array(20, -20, 20);
        System.out.println("Source array: " + array1.toString());
        array1.replaceNegativeElementsByZero();
        System.out.println("Processed array: " + array1.toString());

        System.out.println("\nTask 1.4");
        array1 = new Array(20, -20, 20);
        System.out.println("Source array: " + array1.toString());
        array1.triplePositiveElementsBeforeNegative();
        System.out.println("Processed array: " + array1.toString());

        System.out.println("\nTask 1.5");
        array1 = new Array(20, -20, 20);
        System.out.println("Source array: " + array1.toString());
        System.out.println("Difference between average and minimal element = " + array1.getDifferenceBetweenAverageAndMinimal());

        System.out.println("\nTask 1.6");
        array1 = new Array(20, -20, 20);
        System.out.println("Source array: " + array1.toString());
        System.out.print("Elements that occur more than once and whose odd-numbered indices: ");
        array1.getRepetitiveElementsOnOddPosition();
    }
}
