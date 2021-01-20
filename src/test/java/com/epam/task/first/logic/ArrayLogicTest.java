package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.abs;

public class ArrayLogicTest {

    private final double EXP = 1e6;
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

        Assert.assertTrue(abs(result) - 3.3 <= EXP);
    }

}
