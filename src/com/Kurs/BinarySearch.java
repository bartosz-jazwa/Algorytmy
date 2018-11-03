package com.Kurs;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> implements SearchAlgorithm<T>{

    public Integer searchMid(Integer[] input){
        Integer index = input.length/2;
        return index;
    }

    public void printTab(Integer a, Integer[] input){
        for (int i = 0; i <=a; i++) {
            System.out.println(input[i]);
        }
    }
    public void printLast(Integer b, Integer[] input){
        for (int i = b; i <input.length; i++) {
            System.out.println(input[i]);
        }
    }

    public void pritMid(Integer a, Integer b, Integer[]input){
        for (int i = a; i <=b ; i++) {
            System.out.println(input[i]);
        }
    }

    @Override
    public Integer search(T value, List<T> input) {
        return null;
    }

    @Override
    public Integer search(T value, T[] input) {
        int low = 0;
        int high = input.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (input[mid].compareTo(value) <0){
                high = mid -1;
            }else if (input[mid].compareTo(value) >0){
                low=mid+1;
            }else return mid;
        }
        return -1;
    }
}
