package com.epam.task.first.parsing;

public class ArrayValidator {

    final String regex = "^[0-9 ]+$";

    public boolean isValid(String line) throws NullPointerException {
        return line.matches(regex);
    }
}
