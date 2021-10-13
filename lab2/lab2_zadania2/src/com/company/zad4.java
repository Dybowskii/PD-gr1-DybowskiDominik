package com.company;
import java.util.Scanner;
import  java.lang.Math;


public class zad4 {

    public static void main(String[] args) {
        int max;
        int min;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        System.out.printf("poda liczbe:");
        int liczba = in.nextInt();
        max=liczba;
        min=liczba;
        for (int i=2;i<=n;i++){
            System.out.printf("poda liczbe:");
            liczba = in.nextInt();
            if (liczba> max)
                max=liczba;
            if (liczba<min)
                min=liczba;
        }
        System.out.println("maks="+max);
        System.out.println("min="+min);

    }
}