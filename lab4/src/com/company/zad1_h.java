package com.company;

public class zad1_h {
    public static String change(String str)
    {
        StringBuffer wynik = new StringBuffer();
        for(int i=0 ; i<str.length();i++)
        {
            if (str.charAt(i)>=65 && str.charAt(i)<=90)
                wynik.append(str.toLowerCase().charAt(i));
            else if (str.charAt(i)>=97 && str.charAt(i)<=122)
                wynik.append(str.toUpperCase().charAt(i));

        }
        String napis = wynik.toString();
        return  napis;
    }
    public static void main(String [ ] args)
    {
        String slowo = "AdAm";

        System.out.println(change(slowo));
    }
}
