package com.company;
import java.util.Scanner;

public class zad1_a {

    public static void main(String[] args) {
        int ilosc=0;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();
            if (liczba %2==1)
                ilosc++;





        }
        System.out.println("ilosc liczb nieparzystych: "+ilosc);

    }
}