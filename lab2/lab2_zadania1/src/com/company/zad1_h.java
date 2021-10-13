package com.company;
import java.util.Scanner;

public class zad1_h {

    public static void main(String[] args) {
        int suma=0;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();

            suma+=liczba*Math.pow(-1,i+1);


        }
        System.out.println("wynik sumy wynosi: "+suma);

    }
}