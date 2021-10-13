package com.company;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        double suma=0;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj rozmiar tablic:");
        int n = in.nextInt();
        int[] tab=new int[n];
        System.out.println(n);
        for (int i=0;i<n;i++){
            int liczba= in.nextInt();
            tab[i]=liczba;
        }
        for(int i=1;i<n;i++){
            System.out.println(tab[i]);
            if (i==n-1)
                System.out.println(tab[0]);
        }


    }
}