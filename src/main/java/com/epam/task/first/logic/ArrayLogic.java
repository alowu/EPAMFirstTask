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

        double sum = 0.;

        for (Integer element : elements) {
            sum += element;
        }
        int amountOfElements = elements.size();

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

    public int getAmountOfPositive(Array array) {

        List<Integer> elements = array.getElements();

        int amount = 0;

        for (Integer element : elements) {
            if (element > 0) {
                ++amount;
            }
        }

        return amount;
    }

    public int getAmountOfNegative(Array array) {

        List<Integer> elements = array.getElements();

        int amount = 0;

        for (Integer element : elements) {
            if (element < 0) {
                ++amount;
            }
        }

        return amount;
    }

    public Array replaceNegative(Array array) {

        List<Integer> elements = array.getElements();

        int i = 0;
        for (Integer element : elements) {
            if (element < 0) {
                elements.set(i, element * element);
            }
            ++i;
        }

        return new Array(elements);
    }

    protected void swap(List<Integer> buffer, int i1, int i2) throws ArrayIndexOutOfBoundsException {
        Integer temp1 = buffer.get(i1);
        Integer temp2 = buffer.get(i2);
        buffer.set(i1, temp2);
        buffer.set(i2, temp1);
    }

    public Array bubbleSort(Array array) {
        List<Integer> buffer = array.getElements();
        for (int i = buffer.size() - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (buffer.get(j) > buffer.get(j + 1)) {
                    swap(buffer, j, j + 1);
                }
            }
        }
        return new Array(buffer);
    }
}
