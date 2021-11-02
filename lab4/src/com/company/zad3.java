package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad3 {
    public  static int ile (String nazwa, String subStr) throws FileNotFoundException
    {
        int licznik=0;
        Scanner file = new Scanner(new File(nazwa));
        StringBuffer plik = new StringBuffer();
        while (file.hasNextLine())
            plik.append(file.nextLine());
        String wynik= plik.toString();

        int ilosc;
        for(int i=0;i<=wynik.length()-subStr.length();i++)
        {
            ilosc=0;
            for(int j=0;j<subStr.length();j++)
            {
                if(wynik.charAt(i+j)==subStr.charAt(j))
                    ilosc++;
                else
                    ilosc=0;
            }
            if(ilosc==subStr.length())
                licznik++;
        }
        return licznik;
    }
    public static void main(String [ ] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        String nazwa = sc.nextLine();
        String znak = sc.nextLine();
        System.out.println(ile(nazwa,znak));

    }
}
