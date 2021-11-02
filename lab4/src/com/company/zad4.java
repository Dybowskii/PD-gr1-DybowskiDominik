package com.company;
import java.math.BigInteger;
import java.lang.Math;
public class zad4 {
    public static BigInteger ileZiaren(int n) {
        return BigInteger.valueOf((long) Math.pow(2, n * n) - 1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(ileZiaren(n));
    }
}
