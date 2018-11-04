package com.Kurs;

import java.util.List;

public class BubbleSort implements SortingAlgorithm{


    public static boolean swap(int a, int b, Integer[] tab){
        if(a>=tab.length||b>=tab.length){
            return false;
        }else {
            int tmpHolder = tab[a];
            tab[a]=tab[b];
            tab[b]=tmpHolder;
            return true;
        }
    }
    public static void printElemInd(int[] tab){
        for (int i = 0; i <tab.length; i++) {
            System.out.print(i+":"+tab[i]+", ");
        }
        System.out.println();
    }
    public static void printElemIndLine(int[] tab){
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab.length ; j++) {
                System.out.print(j+":"+tab[j]+", ");
            }
            System.out.println();
        }
    }
    public static void printElemIndLineSwap(Integer[] tab){
        for (int i = 0; i <tab.length ; i++) {
            if (i>=1){
                swap(i-1,i,tab);
            }
            for (int j = 0; j <tab.length ; j++) {
                System.out.print(j+":"+tab[j]+", ");

            }
            System.out.println();
        }
    }
    public static void printElemInTriangle(Integer[] tab){
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab.length-i ; j++) {
                System.out.print(j+":"+tab[j]+", ");
            }
            System.out.println();
        }
    }

    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        for (int i = input.length-2; i >=0; i--) {
            for (int j = 0; j <=i; j++) {
                if (input[j]>input[j+1]){
                    swap(j,j+1,input);
                }
            }
        }
        return input;
    }
    public Integer min(Integer[] input){
        int min=input[0];
        int index = 0;
        for (int i = 0; i <input.length; i++) {
            if (input[i]<min){
                min=input[i];
                index=i;
            }
        }
        return index;
    }
    public Integer min(Integer[] input, int a, int b){
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
}
