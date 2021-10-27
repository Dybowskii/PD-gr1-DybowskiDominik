package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;
import java.lang.String;
public class zad1_d {
    public static String StringRepeat(String str,int n)
    {
        String a="";
        for (int i=0;i<n;i++)
        {
            a+=str;
        }

        return a;



    }
    public static void main (String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        int n=scan.nextInt();
        System.out.println(StringRepeat(str,n));

    }
}
