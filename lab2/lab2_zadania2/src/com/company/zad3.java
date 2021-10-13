package com.company;
import java.util.Scanner;



public class zad3 {

    public static void main(String[] args) {
        int zera=0;
        int dodatnie=0;
        int ujemne=0;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");

            int liczba = in.nextInt();
            if (liczba>0)
                dodatnie++;
            else if (liczba<0)
                ujemne++;
            else
                zera++;

        }
        System.out.println("ilosc liczb dodatnich: "+dodatnie);
        System.out.println("ilosc liczb ujemnych: "+ujemne);
        System.out.println("ilosc zer: "+zera);

    }
}