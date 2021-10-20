package com.company;


public class zad2_d {

    public static int sumaDodatnich(int tab[])
    {
        int suma=0;
        int dlugosc=tab.length;
        for(int i=0; i<dlugosc;i++)
        {
            if (tab[i]>0)
                suma+=tab[i];
        }
        return suma;
    }
    public static int sumaUjemnych(int tab[])
    {
        int suma=0;
        int dlugosc=tab.length;
        for(int i=0; i<dlugosc;i++)
        {
            if (tab[i]<0)
                suma+=tab[i];
        }
        return suma;
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

        System.out.println("suma Dodatnych: "+sumaDodatnich(tablica));
        System.out.println("suma ujemnych:"+sumaUjemnych(tablica));



    }
}



