package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    private final List<Integer> elements;

    public Array(Integer... elements) {
        this.elements = new ArrayList<>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public List<Integer> getElements(){
        return elements;
    }

    public Integer getElement(int index) {
        return this.elements.get(index);
    }

    public boolean equals(Array array) {
        int arrayLen = array.elements.size();
        for (int i = 0; i < arrayLen; ++i){
            if (this.getElement(i).intValue() != array.getElement(i).intValue()) {
                return false;
            }
        }
        return true;
    }

}
