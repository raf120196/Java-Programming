package com.epam.renat_farakhutdinov.java.lesson1.task2;

import java.util.*;

/**
 * Created by Renat Farakhutdinov on 10.02.2018.
 */
public class StringProcessor {
    private static Scanner in = new Scanner(System.in);

    public static void getShortestAndLongestStringInList() {
        int n = getN();

        System.out.println(String.format("Enter %d strings:", n));
        in.nextLine();
        String s = in.nextLine();

        String shortestString = s;
        String longestString = s;

        for (int i = 0; i < n - 1; i++) {
            s = in.nextLine();

            if (shortestString.length() > s.length()) {
                shortestString = s;
            }

            if (longestString.length() < s.length()) {
                longestString = s;
            }
        }

        System.out.println(String.format("The shortest string - \"%s\", length = %d", shortestString, shortestString.length()));
        System.out.println(String.format("The longest string - \"%s\", length = %d", longestString, longestString.length()));
    }

    public static void getStringWithLengthMoreAverage() {
        int n = getN();

        List<String> strings = new ArrayList<>();
        double averageLength = 0.0;

        System.out.println(String.format("Enter %d strings:", n));
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            strings.add(s);
            averageLength += s.length();
        }

        averageLength /= (double) strings.size();
        System.out.println("Average length: " + averageLength);

        System.out.println("String whose length more than average:");
        for (String s : strings) {
            if ((double) s.length() > averageLength) {
                System.out.println(String.format("\"%s\", length = %d", s, s.length()));
            }
        }
    }

    public static void getStringWithLengthLessAverage() {
        int n = getN();

        List<String> strings = new ArrayList<>();
        double averageLength = 0.0;

        System.out.println(String.format("Enter %d strings:", n));
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            strings.add(s);
            averageLength += s.length();
        }

        averageLength /= (double) strings.size();
        System.out.println("Average length: " + averageLength);

        System.out.println("String whose length less than average:");
        for (String s : strings) {
            if ((double) s.length() < averageLength) {
                System.out.println(String.format("\"%s\", length = %d", s, s.length()));
            }
        }
    }

    public static void getWordWithMinimalDifferentSymbols() {
        int n = getN();

        System.out.println(String.format("Enter %d words:", n));
        String answer = in.next();
        for (int i = 0; i < n - 1; i++) {
            String s = in.next();

            if (getCountOfDifferentSymbols(s) < getCountOfDifferentSymbols(answer)) {
                answer = s;
            }
        }

        System.out.println(String.format("Word with minimal count of different symbols" +
                " is \"%s\", count of different symbols = %d", answer, getCountOfDifferentSymbols(answer)));
    }

    public static void getWordWithoutRepetitiveSymbols() {
        int n = getN();

        String answer = null;

        System.out.println(String.format("Enter %d words:", n));
        for (int i = 0; i < n; i++) {
            String s = in.next();

            if (getCountOfDifferentSymbols(s) == s.length()) {
                answer = s;
                break;
            }
        }

        if (answer != null) {
            System.out.println(String.format("Word without repetitive symbols" +
                    " is \"%s\", count of different symbols = %d", answer, getCountOfDifferentSymbols(answer)));
        } else {
            System.out.println("There are no word without repetitive symbols");
        }
    }

    public static void getWordThatContainsOnlyDigits() {
        int n = getN();

        String answer = null;
        int count = 0;

        System.out.println(String.format("Enter %d words:", n));
        for (int i = 0; i < n; i++) {
            String s = in.next();

            if (isWordConsistOnlyDigits(s)) {
                answer = s;
                count++;
                if (count == 2) {
                    break;
                }
            }
        }

        if (answer != null) {
            System.out.println(String.format("Word that consists only digits" +
                    " is \"%s\"", answer));
        } else {
            System.out.println("There are no word that consists only digits");
        }
    }

    private static int getCountOfDifferentSymbols(String str) {
        Set<Character> differentSymbols = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (!differentSymbols.contains(str.charAt(i))) {
                differentSymbols.add(str.charAt(i));
            }
        }

        return differentSymbols.size();
    }

    private static boolean isWordConsistOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static int getN() {
        System.out.print("Enter n: ");
        return in.nextInt();
    }
}
