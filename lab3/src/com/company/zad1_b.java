package com.company;
import java.util.Random;

public class zad1_b {


    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10) + 1;
        System.out.println(n);
        int dodat=0;
        int ujemne=0;
        int zera=0;
        int[] tab = new int[n];
        for(int i=0;i<n;i++)
        {
            tab[i]= Randomnumber.getRandomNumber(-999,999);
            System.out.println(tab[i]);
            if(tab[i]>0)
                dodat++;
            else if(tab[i]<0)
                ujemne++;
            else
                zera++;
        }
        System.out.println("ilosc liczb dodatnich: "+ dodat);
        System.out.println("ilosc licz ujemnych: "+ ujemne);
        System.out.println("ilosc zer: "+zera);

    }
}

