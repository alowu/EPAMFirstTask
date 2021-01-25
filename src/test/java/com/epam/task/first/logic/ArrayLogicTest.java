package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogicTest {

    private final double DELTA = 1e6;
    private final ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxNumberInArray() {

        Array array = new Array(1, 5 ,-3);

        int result = arrayLogic.findMax(array);

        Assert.assertEquals(5, result);

    }

    @Test
    public void testFindMinShouldFindMinNumberInArray() {

        Array array = new Array(1, 5, 15, 0, 79);

        int result = arrayLogic.findMin(array);

        Assert.assertEquals(0, result);

    }

    @Test
    public void testGetAverageShouldCalculateAverageValueInArray() {

        Array array = new Array(1, 2, 7);

        double result = arrayLogic.getAverage(array);

        Assert.assertEquals(3.3, result, DELTA);
    }

    @Test
    public void testGetSumShouldCalculateSummaryOfArrayElements() {

        Array array = new Array(1, 2, 7, -15, 0, 81);

        int result = arrayLogic.getSum(array);

        Assert.assertEquals(76, result);
    }

    @Test
    public void testGetAmountOfPositiveShouldFindAmountOfPositiveNumbersInArray() {

        Array array = new Array(1, -2, 7, -15, 0, 81);

        int result = arrayLogic.getAmountOfPositive(array);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testGetAmountOfNegativeShouldFindAmountOfNegativeNumbersInArray() {

        Array array = new Array(1, -2, 7, -15, 0, 81);

        int result = arrayLogic.getAmountOfNegative(array);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testReplaceNegativeShouldReplaceNegativeNumbersWithTheirSquares() {
        Array array = new Array(1, -2, 7, -15, 0, -9);
        Array expected = new Array(1, 4, 7, 225, 0, 81);

        Array result = arrayLogic.replaceNegative(array);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSwapShouldSwapNumbersWithIndexesI1I2() {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        Array expected = new Array(5, 2, 3, 4, 1);

        arrayLogic.swap(array, 0, 4);
        Array result = new Array(array);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testBubbleSortShouldSortArray() {
        Array array = new Array(5, 3, 1, 2, 4);
        Array expected = new Array(1, 2, 3, 4, 5);

        Array result = arrayLogic.bubbleSort(array);

        Assert.assertEquals(expected, result);
    }
}
