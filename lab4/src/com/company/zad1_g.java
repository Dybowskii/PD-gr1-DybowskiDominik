package com.company;
import java.util.Scanner;
public class zad1_g {
    public static String nice(String str, int ile,char symbol)
    {
        StringBuffer wynik = new StringBuffer();
        int licznik=0;
        for(int i=str.length()-1 ; i>=0;i--)
        {
            if (licznik==ile)
            {
                wynik.append(symbol);
                licznik=0;
            }
            wynik.append(str.charAt(i));
            licznik++;

        }
        wynik.reverse();
        String napis = wynik.toString();
        return  napis;
    }
    public static void main(String [ ] args)
    {
        Scanner sc= new Scanner(System.in);
        String slowo = "1234567891";
        char cos;
        cos= sc.nextLine().charAt(0);

        System.out.println(nice(slowo,4,cos));
    }
}
