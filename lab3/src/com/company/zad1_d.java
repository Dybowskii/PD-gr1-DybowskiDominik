package com.company;


public class zad1_d {


    public static void main(String[] args) {

        int n = Randomnumber.getRandomNumber(0,10);
        System.out.println(n);
        int suma_dodatnia=0;
        int suma_ujemna=0;
        int[] tab = new int[n];
        for(int i=0;i<n;i++)
        {
            tab[i]= Randomnumber.getRandomNumber(-999,999);
            System.out.println(tab[i]);
            if(tab[i]>0)
                suma_dodatnia+=tab[i];
            else if(tab[i]<0)
                suma_ujemna+=tab[i];
        }



        System.out.println("suma liczb dodatnich:"+suma_dodatnia);
        System.out.println("suma liczb ujemnych: "+suma_ujemna);

    }
}

