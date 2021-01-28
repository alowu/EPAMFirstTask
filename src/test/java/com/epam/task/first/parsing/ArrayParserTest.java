package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayParserTest {

    private final ArrayParser parser = new ArrayParser();

    @Test
    public void testParseShouldParseNumericStringIntoArray() {
        String numbers = "1 2 3";
        Array expected = new Array(1, 2, 3);

        Array result = parser.parse(numbers);

        Assert.assertEquals(expected, result);
    }
}
