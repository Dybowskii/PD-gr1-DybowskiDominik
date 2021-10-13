package com.company;
import java.util.Scanner;
import  java.lang.Math;


public class zad1_h {

    public static void main(String[] args) {
        int ilosc=0;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();
            if (Math.abs(liczba)<i*i)
                ilosc++;

        }
        System.out.println("ilosc: "+ilosc);

    }
}