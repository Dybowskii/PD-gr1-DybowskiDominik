package com.company;
import java.util.ArrayList;
public class zad2 {

    public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        int dluzsza;
        int i=0;
        int ktora;
        if(a.size()<b.size()) {
            dluzsza = a.size();
            ktora = 0;
        }
        else
        {
            dluzsza=b.size();
            ktora=1;
        }

        for(i=0;i<dluzsza;i++)
        {
                list.add(a.get(i));
                list.add(b.get(i));
        }
        if(ktora==0)
            for(i=dluzsza;i<b.size();i++)
                list.add(b.get(i));
        else
            for(i=dluzsza;i<a.size();i++)
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
        list2.add(9);
        list2.add(7);
        list2.add(4);
        list2.add(9);
        list2.add(11);
        System.out.println(merge(list1,list2));


    }
}
