package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;
import java.lang.String;
public class zad1_e {
    public static int[] where(String str, String Substr)
    {
        int licznik=0;
        int ilosc;
        int k=0;

        for(int i=0;i<=str.length()-Substr.length();i++)
        {
            ilosc=0;
            for(int j=0;j<Substr.length();j++)
            {
                if(str.charAt(i+j)==Substr.charAt(j))
                    ilosc++;
                else
                    ilosc=0;
            }
            if(ilosc==Substr.length())
            {
                licznik++;
            }

        }
        int[] tab= new int[licznik];
        for(int i=0;i<=str.length()-Substr.length();i++)
        {
            ilosc=0;
            for(int j=0;j<Substr.length();j++)
            {
                if(str.charAt(i+j)==Substr.charAt(j))
                    ilosc++;
                else
                    ilosc=0;
            }
            if(ilosc==Substr.length())
            {
                tab[k]=i;
                k++;
            }

        }
        return tab;



    }
    public static void main (String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        String Substr= scan.nextLine();
        int[] tab = where(str,Substr);
        for(int i=0;i<tab.length;i++)
            System.out.println(tab[i]);


    }
}
