package com.company;
import java.util.ArrayList;
public class zad4 {

    public static ArrayList<Integer> reversed (ArrayList<Integer> a)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--)
            list.add(a.get(i));
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
        System.out.println(reversed(list1));


    }
}
