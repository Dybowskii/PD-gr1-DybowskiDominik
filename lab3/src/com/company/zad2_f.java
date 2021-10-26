package com.company;


public class zad2_f {

    public static void signum(int tab[])
    {
        for(int i=0;i<tab.length ; i++)
        {

            if(tab[i]>0)
                tab[i]=1;
            else if(tab[i]<0)
                tab[i]=-1;
        }
        System.out.println("tablica po zmianie:");
        for (int i=0;i<tab.length;i++) {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {

        int n = Randomnumber.getRandomNumber(1,10);
        System.out.println(n);
        int[] tablica = new int[n];
        Randomnumber.generuj(tablica,n,-999,999);
        for (int i=0;i<n;i++)
        {
            System.out.println(tablica[i]);
        }

        signum(tablica);



    }
}



