package com.company;

public class Randomnumber {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void generuj (int tab[], int n, int min, int max){
        for (int i=0;i<n;i++)
            tab[i]=getRandomNumber(min,max);
    }
}
