package com.epam.task.first.logic;

import com.epam.task.first.parsing.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCreatorTest {

    private final ArrayValidator validator = new ArrayValidator();

    @Test
    public void testIsValidShouldValidateCorrectNumericStrings() {
        String correct = "1 2 33";

        boolean valid = validator.isValid(correct);

        Assert.assertTrue(valid);
    }

    @Test
    public void testIsValidShouldValidateWrongNumericStrings() {
        String wrong = "? 666 what";

        boolean notValid = validator.isValid(wrong);

        Assert.assertFalse(notValid);
    }
}
