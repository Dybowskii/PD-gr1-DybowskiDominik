package com.company;

public class zad1_j {
    public static String nice(String str)
    {
        StringBuffer wynik = new StringBuffer();
        int licznik=0;
        for(int i=str.length()-1 ; i>=0;i--)
        {
            if (licznik==3)
            {
                wynik.append("'");
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
        String slowo = "1234567891";

        System.out.println(nice(slowo));
    }
}
