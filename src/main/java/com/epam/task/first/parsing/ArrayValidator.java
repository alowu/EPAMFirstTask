package com.epam.task.first.parsing;

public class ArrayValidator {

    final String regex = "^[0-9 ]+$";

    public boolean isValid(String line){
        return line.matches(regex);
    }
}
