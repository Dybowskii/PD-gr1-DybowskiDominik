package com.company;
import java.util.ArrayList;
import java.util.Collection;

public class zad1 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list=a;
        list.addAll(b);
        return list;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        ArrayList<Integer> list2= new ArrayList<Integer>();
        list1.add(1);
        list1.add(4);
        list1.add(9);
        list1.add(16);
        list2.add(9);
        list2.add(7);
        list2.add(4);
        list2.add(9);
        list2.add(11);
        System.out.println(append(list1,list2));


    }
}
