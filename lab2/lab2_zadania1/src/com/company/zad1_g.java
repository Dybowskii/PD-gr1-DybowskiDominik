package com.company;
import java.util.Scanner;

public class zad1_g {

    public static void main(String[] args) {
        int suma=0;
        int iloczyn=1;
        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();
            suma+=liczba;
            iloczyn*=liczba;

        }
        System.out.println("wynik sumy wynosi: "+suma);
        System.out.println("wynik iloczynu wynosi: "+iloczyn);
    }
}