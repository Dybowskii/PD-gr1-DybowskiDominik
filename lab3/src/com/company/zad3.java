package com.company;
import java.util.Scanner;



public class zad3 {
    public static void generuj (int tab[][],int n, int m, int min, int max){

        for (int i=0;i<n;i++)
            for (int j=0; j<m;j++)
                tab[i][j]=Randomnumber.getRandomNumber(min,max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] tab;
        tab = new int [n][m];
        generuj(tab,n,m,1,10);
        int[][] tab2;
        tab2 = new int[m][k];
        generuj(tab2,m,k,1,10);
        for (int i=0;i<n;i++) {

            for (int j = 0;j<m; j++)
            {
                System.out.print(tab[i][j]+ "   ");
            }
            System.out.println("");
        }
        for (int i=0;i<m;i++) {

            for (int j = 0;j<k; j++)
            {
                System.out.print(tab2[i][j]+ "   ");
            }
            System.out.println("");
        }
        int[][] tab3;
        tab3=new  int [n][k];
        for (int x=0;x<n;x++) {
            for (int y = 0; y < k; y++) {
                int suma = 0;
                for (int i = 0; i < m; i++)
                    suma += tab[x][i] * tab2[i][y];
                tab3[x][y] = suma;
            }
        }
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
                System.out.print(tab3[i][j]+"   ");
            System.out.println("");
        }


    }


    }




