package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad2 {
    public  static int ile (String nazwa, char znak) throws FileNotFoundException
    {
        int licznik=0;
        Scanner file = new Scanner(new File(nazwa));
        StringBuffer plik = new StringBuffer();
        while (file.hasNextLine())
            plik.append(file.nextLine());
        String wynik= plik.toString();

        for (int i=0;i<wynik.length();i++)
            if (wynik.charAt(i)==znak)
                licznik++;
        return licznik;
    }
    public static void main(String [ ] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
      String nazwa = sc.nextLine();
      char znak = sc.nextLine().charAt(0);
        System.out.println(ile(nazwa,znak));

    }
}
