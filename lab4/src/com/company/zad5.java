package com.company;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class zad5 {
    public static BigDecimal oprocentowanie(double k, double p, int n)
    {
        BigDecimal wynik = new BigDecimal(k);
        BigDecimal stopa = new BigDecimal(p);
        for (int i=0; i<n; i++ )
        {
            wynik = wynik.add(wynik.multiply(stopa));
        }
        wynik = wynik.setScale(2, RoundingMode.HALF_UP);
        return wynik;

    }

    public static void main(String [ ] args)
    {
        double k = 5000;
        double p = 0.02;
        int n = 10;
        System.out.println(oprocentowanie(k,p,n));
    }

}