package com.company;


public class zad1_e {


    public static void main(String[] args) {

        int n = Randomnumber.getRandomNumber(0,10);
        System.out.println(n);

        int[] tab = new int[n];
        int ciag=0;
        int maks_ciag=0;
        for(int i=0;i<n;i++)
        {
            tab[i]= Randomnumber.getRandomNumber(-999,999);
            System.out.println(tab[i]);
            if(tab[i]>0)
                ciag++;
            else if (tab[i]<0) {
                if (ciag > maks_ciag)
                    maks_ciag = ciag;
                ciag=0;
            }
        }
        if (ciag>maks_ciag)
            maks_ciag=ciag;

        System.out.println("dlugosc maks ciagu:"+ maks_ciag);

    }
}

