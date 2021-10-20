package com.company;
import java.util.Random;

public class zad1_a {


    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(9) + 1;
        System.out.println(n);
        int parz=0;
        int nieparz=0;
        int[] tab = new int[n];
        for(int i=0;i<n;i++)
        {
            tab[i]= Randomnumber.getRandomNumber(-999,999);
            System.out.println(tab[i]);
            if(tab[i]%2==0)
                parz++;
            else
                nieparz++;
        }
        System.out.println("ilosc liczb parzystych: "+ parz);
        System.out.println("ilosc licz nieparzystych: "+ nieparz);

    }
}

