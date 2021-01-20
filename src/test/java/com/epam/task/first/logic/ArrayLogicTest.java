package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

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

}
