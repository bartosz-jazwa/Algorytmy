package com.Kurs;

import java.util.List;

public class LinearSearch<T extends Comparable<T>> implements SearchAlgorithm<T>{

    @Override
    public Integer search(T value, List<T> input) {
        return null;
    }

    @Override
    public Integer search(T value, T[] input) {
        for (int i = 0; i <input.length; i++) {
            if (input[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}
