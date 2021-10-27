package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;
import java.lang.String;
public class zad1_c {
    public static String countSubStr(String str)
    {
        int srodek=str.length()/2;
        String a= "";
        if(srodek%2==1)
        {
            a= String.valueOf(str.charAt(srodek-1))+str.valueOf(str.charAt(srodek));
        }
        else
            a=str.valueOf(str.charAt(srodek));
        return a;



    }
    public static void main (String[] args)
    {
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();

        System.out.println(countSubStr(str));
    }
}
