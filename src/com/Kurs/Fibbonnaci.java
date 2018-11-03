package com.Kurs;

public class Fibbonnaci {
    public void printElem(int elements){
        int elem1 = 0;
        int elem2 = 0;
        int sum = 0;
        for (int i = 0; i <elements ; i++) {

            if (i ==0){
                elem1=i;
                elem2 =i;
                sum = 0;
            }
            if (i ==1){
               elem1 = 0;
               elem2 = 0;
               sum = 1;
            }
            if (i>=2){

                elem2=elem1;
                elem1=sum;
                sum=elem1+elem2;
            }
            System.out.println(sum);
        }

    }
    public int fibonacci(int index){
        if (index==0){
            return 0;
        }else if (index==1){
            return 1;
        }
        return fibonacci(index -1)+fibonacci(index-2);
    }
}
