package com.company;
import java.util.Scanner;



public class zad1_d {

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
        for (int i=1; i<n-1;i++)
        {
            if (tab[i]<(tab[i-1]+tab[i+1])/2)
                ilosc++;
        }
        System.out.println("ilosc:"+ilosc);
    }
}
