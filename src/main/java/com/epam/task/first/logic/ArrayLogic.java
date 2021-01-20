package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayLogic {

    public int findMax(Array array) {

        List<Integer> elements = array.getElements();

        Integer max = elements.get(0);

        for (Integer element : elements) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public int findMin(Array array) {

        List<Integer> elements = array.getElements();

        Integer min = elements.get(0);

        for (Integer element : elements) {
            if (element < min) {
                min = element;
            }
        }

        return min;

    }

    public double getAverage(Array array) {

        List<Integer> elements = array.getElements();

        int amountOfElements = 0;
        Double sum = 0.;

        for (Integer element : elements) {
            sum += element;
            amountOfElements++;
        }

        return sum / amountOfElements;
    }

    public int getSum(Array array) {

        List<Integer> elements = array.getElements();

        int sum = 0;

        for (Integer element : elements) {
            sum += element;
        }

        return sum;
    }

}
