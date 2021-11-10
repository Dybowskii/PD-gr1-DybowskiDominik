package com.company;
import java.util.ArrayList;
public class zad5 {

    public static void reversed (ArrayList<Integer> a)
    {
        int pom;

        for(int i=0;i<a.size()/2;i++)
        {
            pom=a.get(i);
            a.set(i,a.get(a.size()-i-1));
            a.set(a.size()-i-1,pom);
        }

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(1);
        list1.add(4);
        list1.add(9);
        list1.add(16);
        reversed(list1);
        System.out.println(list1);


    }
}
