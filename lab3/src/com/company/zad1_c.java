package com.company;
import java.util.Random;

public class zad1_c {


    public static void main(String[] args) {
        Random r = new Random();
        int n = Randomnumber.getRandomNumber(0,10);
        System.out.println(n);

        int[] tab = new int[n];
        int ilosc=0;
        for(int i=0;i<n;i++)
        {
            tab[i]= Randomnumber.getRandomNumber(-999,999);
            System.out.println(tab[i]);
        }
        int max=tab[1];
        for (int i=1;i<n;i++)
        {
            if (tab[i]>max)
                max=tab[i];
        }
        for (int i=1;i<n;i++)
        {
            if (tab[i]==max)
                ilosc++;
        }
        System.out.println("max:"+max);
        System.out.println("wystepuje "+ilosc+" razy");

    }
}

