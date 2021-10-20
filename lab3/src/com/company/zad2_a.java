package com.company;


    public class zad2_a {

        public static int ileNieparzystych(int tab[])
        {
           int nieparzyste=0;
           int dlugosc=tab.length;
            for(int i=0; i<dlugosc;i++)
            {
                if (tab[i]%2!=0)
                    nieparzyste++;
            }
            return nieparzyste;
        }
        public static int ileParzystych(int tab[])
        {
            int parzyste=0;
            int dlugosc=tab.length;
            for(int i=0; i<dlugosc;i++)
            {
                if (tab[i]%2==0)
                    parzyste++;
            }
            return parzyste;
        }

        public static void main(String[] args) {

            int n = Randomnumber.getRandomNumber(0,10);
            System.out.println(n);
            int[] tablica = new int[n];
            Randomnumber.generuj(tablica,n,-999,999);
            for (int i=0;i<n;i++)
            {
                System.out.println(tablica[i]);
            }

            System.out.println("ilosc liczb nieparzystych: "+ileNieparzystych(tablica));
            System.out.println("ilosc liczb parzystych: "+ileParzystych(tablica));


        }
    }



