package com.company;


public class zad2_c {

    public static int ileMaksymalnych(int tab[])
    {
        int maks=tab[0];
        int ile=0;
        int dlugosc=tab.length;
        for(int i=1; i<dlugosc;i++)
        {
            if (tab[i]>maks)
                maks=tab[i];
        }
        for(int i=0;i<dlugosc;i++)
            if(tab[i]==maks)
                ile++;

        return ile;
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

        System.out.println("ilosc powtorzen maksa: "+ileMaksymalnych(tablica));



    }
}



