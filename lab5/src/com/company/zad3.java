package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class zad3 {

    public static ArrayList<Integer> mergesort (ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        int licznik1=0;
        int licznik2=0;
        Collections.sort(a);
        Collections.sort(b);
        while(licznik1<a.size()-1 && licznik2<b.size()-1)
        {
            if(a.get(licznik1)<b.get(licznik2))
            {
                    list.add(a.get(licznik1));
                    licznik1++;
            }
            else if (a.get(licznik1)>=b.get(licznik2))
            {
                    list.add(b.get(licznik1));
                    licznik2++;
            }
        }
        /*if(licznik1==a.size()-1)
            for(int i=licznik2;i<b.size();i++)
                list.add(b.get(i));
        else if(licznik2==b.size()-1)
            for(int i=licznik1;i<a.size();i++)
                list.add(a.get(i));*/
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
        System.out.println(mergesort(list1,list2));


    }
}
