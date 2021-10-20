package com.company;
import java.util.Random;

public class zad1_g {


    public static void main(String[] args) {

        int n = Randomnumber.getRandomNumber(0,10);
        System.out.println(n);
        int[] tab = new int[n];
        for(int i=0;i<n;i++)
        {
            tab[i]= Randomnumber.getRandomNumber(-999,999);
            System.out.println(tab[i]);
            if(tab[i]>0)
                tab[i]=1;
            else if(tab[i]<0)
                tab[i]=-1;
        }
        System.out.println("tablica po zmianie");

        for(int i=0;i<n;i++)
        {
            System.out.println(tab[i]);
        }

    }
}

