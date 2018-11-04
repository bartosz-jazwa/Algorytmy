package com.Kurs;

import java.util.List;

public class SelectionSort implements SortingAlgorithm{

    private static boolean swap(int a, int b, Integer[] tab){
        if(a>=tab.length||b>=tab.length){
            return false;
        }else {
            int tmpHolder = tab[a];
            tab[a]=tab[b];
            tab[b]=tmpHolder;
            return true;
        }
    }
    private Integer min(Integer[] input, int a, int b){
        int min=input[a];
        int index = a;
        if(a>=input.length||b>=input.length){
            return -1;
        }else {
            for (int i = a; i <= b; i++) {
                if (input[i] < min) {
                    min = input[i];
                    index = i;
                }
            }
        }
        return index;

    }

    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        int newMin = 0;
        for (int i = 0; i <input.length; i++) {
            newMin=min(input,i,input.length-1);
            swap(i,newMin,input);
        }


        return input;
    }
}
