package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private final DataReader dataReader;
    private final ArrayValidator validator;
    private final ArrayParser parser;

    public ArrayCreator(final DataReader dataReader, final ArrayValidator validator, final ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array> create(String fileName) throws DataException {
        List<String> lines = dataReader.readData(fileName);
        List<Array> array = new ArrayList<>();
        for (String line : lines) {
            if (validator.isValid(line)) {
                array.add(parser.parse(line));
            }
        }
        return array;
    }

}
