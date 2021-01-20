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

}
