package com.company;
import java.util.Scanner;
import  java.lang.Math;



public class zad1_e {

    public static void main(String[] args) {
        int ilosc=0;

        Scanner in = new Scanner(System.in);
        System.out.print("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);

        for (int i=1;i<=n;i++){
            int silnia=1;
            for (int j=1;j<=i;j++)
                silnia*=j;
            int liczba= in.nextInt();
            if(liczba>Math.pow(2,i) && liczba<silnia)
                ilosc++;
        }

        System.out.println("ilosc:"+ilosc);
    }
}