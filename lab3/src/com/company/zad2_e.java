package com.company;


public class zad2_e {

    public static int ileMaksymalnych(int[] tab)
    {
        int ciag=0;
        int maks_ciag=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
                ciag++;
            else if (tab[i]<=0) {
                if (ciag > maks_ciag)
                    maks_ciag = ciag;
                ciag=0;
            }
        }
        if (ciag>maks_ciag)
            maks_ciag=ciag;
        return maks_ciag;
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

        System.out.println("maks_ciag: "+ileMaksymalnych(tablica));



    }
}



