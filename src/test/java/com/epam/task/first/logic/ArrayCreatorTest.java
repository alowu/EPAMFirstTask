package com.epam.task.first.logic;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA = Arrays.asList("1 2 3", "1x 5 7", "87 91 57", "! 6 ?");

    @Test
    public void testCreateShouldCreateListArrayFromTestData() throws DataException {
        DataReader readerM = Mockito.mock(DataReader.class);
        when(readerM.readData(anyString())).thenReturn(TEST_DATA);
        ArrayParser parserM = Mockito.mock(ArrayParser.class);
        when(parserM.parse(anyString())).thenReturn(new Array(1, 2, 3), new Array(87, 91, 57));
        ArrayValidator validatorM = Mockito.mock(ArrayValidator.class);
        when(validatorM.isValid(anyString())).thenReturn(true, false, true, false);

        List<Array> expected = Arrays.asList(new Array(1, 2, 3), new Array(87, 91, 57));

        ArrayCreator creator = new ArrayCreator(readerM, validatorM, parserM);
        List<Array> result = creator.create(anyString());

        Assert.assertEquals(expected, result);
    }

}
