package com.company;

import java.util.Scanner;

public class zad1_g {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int lewy = in.nextInt();
        int prawy = in.nextInt();
        if (n >= 1 && n <= 100) {
            int[] tab = new int[n];
            System.out.println("tablica przed zmiana: ");
            for (int i = 0; i < n; i++) {

                tab[i] = Randomnumber.getRandomNumber(-999, 999);
                System.out.println(tab[i]);
            }
            int pom;
            int licznik = 1;
            System.out.println("tablica po zmianie");
            for (int i = lewy-1; i < prawy/2; i++) {
                pom = tab[i];
                tab[i] = tab[prawy - licznik];
                tab[prawy - licznik] = pom;
                licznik++;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(tab[i]);
            }
        }
    }
}