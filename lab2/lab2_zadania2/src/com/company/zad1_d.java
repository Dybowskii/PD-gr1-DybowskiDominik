package com.company;
import java.util.Scanner;
import  java.lang.Math;


public class zad1_d {

    public static void main(String[] args) {
        int ilosc=0;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();
            if (Math.sqrt(liczba)%2==0)
                ilosc++;

        }
        System.out.println("ilosc: "+ilosc);

    }
}