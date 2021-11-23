package com.company;

public class zad2 {

    public static void main(String[] args) {
        IntegerSet tablica1 = new IntegerSet();
        tablica1.insertElement(5);
        tablica1.insertElement(7);
        tablica1.insertElement(9);
        tablica1.deleteElement(5);
        tablica1.ToString();
        IntegerSet tablica2 = new IntegerSet();
        tablica2.insertElement(7);
        tablica2.insertElement(10);
        tablica2.ToString();
        IntegerSet tab=tablica1.union(tablica1.tab,tablica2.tab);
        IntegerSet tabx= tablica1.intersection(tablica1.tab,tablica2.tab);
        tabx.ToString();
        tab.ToString();
        tablica1.equal(tablica1,tablica2);
        tablica1.deleteElement(9);
        tablica2.deleteElement(10);
        tablica1.equal(tablica1,tablica2);



    }


}
