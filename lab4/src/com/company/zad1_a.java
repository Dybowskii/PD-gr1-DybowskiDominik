package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;
import java.lang.String;
public class zad1_a {
    public static int countChar(String str, char c)
    {
        int licznik=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                licznik++;
            }
        }
        return licznik;

    }
    public static void main (String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        char c = scan.next().charAt(0);
        System.out.println(countChar(str,c));
    }
}
