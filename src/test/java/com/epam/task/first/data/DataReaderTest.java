package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATA = "./src/test/resources/input.txt";
    private final DataReader reader = new DataReader();

    @Test
    public void testReadDataShouldReadDataFromFile() throws DataException {
        List<String> expected = Arrays.asList("1 2 3", "1x 5 7", "87 91 57", "! 6 ?");

        List<String> result = reader.readData(TEST_DATA);

        Assert.assertEquals(expected, result);
    }

}
