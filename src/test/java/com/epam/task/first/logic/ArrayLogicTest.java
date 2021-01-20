package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;

import static java.lang.Math.abs;

public class ArrayLogicTest {

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

        double EXP = 1e6;
        Assert.assertTrue(abs(result) - 3.3 <= EXP);
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

        int result = arrayLogic.getAmountOfPositive(array);

        Assert.assertEquals(2, result);
    }

}
