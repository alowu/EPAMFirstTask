package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;

public class ArrayParser {

    public Array parse(String data){
        String[] dataBuf = data.split(" ");
        Integer[] numbers = new Integer[dataBuf.length];
        for (int i = 0; i < dataBuf.length; ++i) {
            numbers[i] = Integer.parseInt(dataBuf[i]);
        }
        return new Array(numbers);
    }
}
