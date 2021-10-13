package com.company;
import java.util.Scanner;

public class zad1_i {

    public static void main(String[] args) {
        double suma=0;

        Scanner in = new Scanner(System.in);
        System.out.printf("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        for (int i=1;i<=n;i++){
            System.out.printf("poda liczbe:");
            int liczba = in.nextInt();
            int silnia=1;
            for (int j=1; j<=i ;j++)
                silnia*=j;

            suma+=(Math.pow(-1,i)*liczba)/silnia;


        }
        System.out.println("wynik sumy wynosi: "+suma);

    }
}