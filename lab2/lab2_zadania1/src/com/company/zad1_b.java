package com.company;
import java.util.Scanner;

public class zad1_b {

    public static void main(String[] args) {
        int iloczyn=1;
        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();
            iloczyn*=liczba;

        }
        System.out.println("wyni wynosi: "+iloczyn);
    }
}