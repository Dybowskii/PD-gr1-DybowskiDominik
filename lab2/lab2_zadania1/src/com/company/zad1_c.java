package com.company;
import java.util.Scanner;
import  java.lang.Math;

public class zad1_c {

    public static void main(String[] args) {
        int suma=0;
        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();
            suma+=Math.abs(liczba);

        }
        System.out.println("wynik wynosi: "+suma);
    }
}