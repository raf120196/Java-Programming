package com.epam.renat_farakhutdinov.java.lesson1.task1;

import java.util.*;

/**
 * Created by Renat Farakhutdinov on 10.02.2018.
 */
public class Array {
    private List<Integer> array;

    /**
     * Constructor that initializes array by ArrayList and add random elements to the array
     *
     * @param size       count elements in the array
     * @param lowerBound lower bound of created random numbers
     * @param upperBound upper bound of created random numbers
     */
    public Array(int size, int lowerBound, int upperBound) {
        array = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array.add(lowerBound + (int) (Math.random() * upperBound * 2));
        }
    }

    /**
     * A method that swaps maximal negative and minimal positive values in the array
     * If there are no positive or no negative elements then method doesn't execute a swap
     */
    public void swapMaxNegativeWithMinPositive() {
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;

        int maxNegativeIdx = -1;
        int minPositiveIdx = -1;

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);

            if (x < 0 && x > maxNegative) {
                maxNegative = x;
                maxNegativeIdx = i;
            }

            if (x > 0 && x < minPositive) {
                minPositive = x;
                minPositiveIdx = i;
            }
        }

        if (maxNegative == Integer.MIN_VALUE || minPositive == Integer.MAX_VALUE) {
            return;
        }

        System.out.println(String.format("Maximal negative element %d on position %d", maxNegative, maxNegativeIdx));
        System.out.println(String.format("Minimal positive element %d on position %d", minPositive, minPositiveIdx));

        array.set(maxNegativeIdx, minPositive);
        array.set(minPositiveIdx, maxNegative);
    }

    /**
     * A method that calculates amount of elements on even positions
     *
     * @return calculated result
     */
    public int getSummaOfEvenPositionElements() {
        int result = 0;

        for (int i = 0; i < array.size(); i++) {
            if (i % 2 == 0) {
                result += array.get(i);
            }
        }

        return result;
    }

    /**
     * A method that replaces all negative elements by zero
     */
    public void replaceNegativeElementsByZero() {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 0) {
                array.set(i, 0);
            }
        }
    }

    /**
     * A method that triples all positive elements that stand before negatives elements
     */
    public void triplePositiveElementsBeforeNegative() {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > 0 && array.get(i + 1) < 0) {
                array.set(i, 3 * array.get(i));
            }
        }
    }

    /**
     * A method that calculated a difference between average and minimal element
     *
     * @return the difference
     */
    public double getDifferenceBetweenAverageAndMinimal() {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int x : array) {
            sum += x;

            if (x < min) {
                min = x;
            }
        }

        System.out.println("Average = " + (sum / (double) array.size()));
        System.out.println("Minimal element = " + min);
        return sum / (double) array.size() - min;
    }

    /**
     * A method that outputs all elements that occur more than once and whose odd-numbered indices
     */
    public void getRepetitiveElementsOnOddPosition() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Map<Integer, Integer> distictElementsWithPosition = new HashMap<>();
        Set<Integer> resultArray = new HashSet<>();
        for (int i = 0; i < array.size(); i++) {
            if (!distictElementsWithPosition.containsKey(array.get(i))) {
                distictElementsWithPosition.put(array.get(i), i);
            } else {
                if (distictElementsWithPosition.get(array.get(i)) % 2 != 0 && i % 2 != 0 && !resultArray.contains(array.get(i))) {
                    resultArray.add(array.get(i));
                    sb.append(array.get(i)).append(", ");
                }
            }
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length() - 1);
        }
        sb.append(']');

        System.out.println(String.valueOf(sb));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < array.size() - 1; i++) {
            sb.append(array.get(i)).append(", ");
        }
        sb.append(array.get(array.size() - 1)).append(']');
        return String.valueOf(sb);
    }
}
