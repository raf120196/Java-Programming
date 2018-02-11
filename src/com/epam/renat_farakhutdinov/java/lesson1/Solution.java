package com.epam.renat_farakhutdinov.java.lesson1;

import com.epam.renat_farakhutdinov.java.lesson1.task1.TaskOne;
import com.epam.renat_farakhutdinov.java.lesson1.task2.TaskTwo;
import com.epam.renat_farakhutdinov.java.lesson1.task3.TaskThree;

/**
 * Created by Renat Farakhutdinov on 10.02.2018.
 */
public class Solution {
    public static void main(String[] args) {
        Task task1 = new TaskOne();
        task1.startTask();

        Task task2 = new TaskTwo();
        task2.startTask();

        Task task3 = new TaskThree();
        task3.startTask();
    }
}
