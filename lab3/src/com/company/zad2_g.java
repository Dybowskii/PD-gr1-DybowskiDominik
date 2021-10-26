package com.company;
import java.util.Scanner;

public class zad2_g {


    public static void odwrocFragment(int tab[],int prawy,int lewy)
    {
        int pom;
        int licznik = 1;
        System.out.println("tablica po zmianie");
        for (int i = lewy-1; i <= prawy/2; i++) {
            pom = tab[i];
            tab[i] = tab[prawy - licznik];
            tab[prawy - licznik] = pom;
            licznik++;
        }

        System.out.println("tablica po zmianie:");
        for (int i=0;i< tab.length;i++) {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int lewy = in.nextInt();
        int prawy = in.nextInt();


        int[] tablica = new int[n];
        Randomnumber.generuj(tablica,n,-999,999);
        for (int i=0;i<n;i++)
        {
            System.out.println(tablica[i]);
        }

        odwrocFragment(tablica,prawy,lewy);



    }
}



