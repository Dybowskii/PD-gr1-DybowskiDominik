package com.company;
import java.util.Scanner;



public class zad5 {

    public static void main(String[] args) {
        int ilosc=0;

        Scanner in = new Scanner(System.in);
        System.out.print("podaj liczbe petli:");
        int n = in.nextInt();
        System.out.println(n);
        int[] tab=new int[n];

        for (int i=0;i<n;i++){
            int liczba = in.nextInt();
            tab[i]=liczba;
        }
        for (int i=0; i<n-1;i++)
        {
            if (tab[i]>0 && tab[i+1]>0)
                ilosc++;
        }
        System.out.println("ilosc sasiadujacych dodatnik par:"+ilosc);
    }
}