package com.company;


public class zad2_b {

    public static int ileDodatnich(int tab[])
    {
        int dodatnie=0;
        int dlugosc=tab.length;
        for(int i=0; i<dlugosc;i++)
        {
            if (tab[i]>0)
                dodatnie++;
        }
        return dodatnie;
    }
    public static int ileUjemnych(int tab[])
    {
        int ujemne=0;
        int dlugosc=tab.length;
        for(int i=0; i<dlugosc;i++)
        {
            if (tab[i]<0)
                ujemne++;
        }
        return ujemne;
    }
    public static int ileZerowych(int tab[])
    {
        int zera=0;
        int dlugosc=tab.length;
        for(int i=0; i<dlugosc;i++)
        {
            if (tab[i]==0)
                zera++;
        }
        return zera;
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

        System.out.println("ilosc liczb dodatnich: "+ileDodatnich(tablica));
        System.out.println("ilosc liczb ujemnych: "+ileUjemnych(tablica));
        System.out.println("ilosc zer: "+ileZerowych(tablica));


    }
}



