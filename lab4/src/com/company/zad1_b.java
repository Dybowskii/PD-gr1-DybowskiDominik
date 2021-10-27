package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;
import java.lang.String;
public class zad1_b {
    public static int countSubStr(String str, String c)
    {
        int licznik=0;
        int ilosc;
        for(int i=0;i<=str.length()-c.length();i++)
        {
            ilosc=0;
            for(int j=0;j<c.length();j++)
            {
                if(str.charAt(i+j)==c.charAt(j))
                    ilosc++;
                else
                    ilosc=0;
            }
            if(ilosc==c.length())
                licznik++;
        }
        return licznik;

    }
    public static void main (String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        String SubStr = scan.nextLine();
        System.out.println(countSubStr(str,SubStr));
    }
}
