package com.company;

public class IntegerSet {
    public boolean[] tab = new  boolean[100];

    public void insertElement(int a)
    {
        if (a>0 && a<=100)
            tab[a-1]=true;
    }
    public void deleteElement(int a)
    {
        if (a>0 && a<=100)
            tab[a-1]=false;
    }
    public void ToString()
    {
        StringBuffer tablica = new StringBuffer();
        for(int i=0;i<100;i++)
        {
            if(this.tab[i]==true)
            {
                tablica.append(i+1);
                tablica.append(" ");
            }
        }
        System.out.println(tablica.toString());


    }
    public void  union(boolean[] tab1, boolean[] tab2)
    {
        IntegerSet tab3 = new IntegerSet();
        for (int i=0;i<100;i++)
        {
            if(tab1[i]==true || tab2[i]==true)
                tab3.tab[i]=true;
        }
        tab3.ToString();
    }
    public void  intersection(boolean[] tab1, boolean[] tab2)
    {
        IntegerSet tab3 = new IntegerSet();
        for (int i=0;i<100;i++)
        {
            if(tab1[i]==true && tab2[i]==true)
                tab3.tab[i]=true;
        }
        tab3.ToString();
    }

}
