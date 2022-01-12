package pl.imijad.Dybowski;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

class MyIterable<T> implements Iterable<T> {

    private List<T> list;

    public MyIterable(T [] t) {

        list = Arrays.asList(t);
        Collections.reverse(list);
    }

    @Override
    public Iterator<T> iterator() {

        return list.iterator();
    }
}
public class iterable {

    public static void main(String [] args) {
        Pracownik [] prac= new Pracownik[3];
        prac[0]= new Pracownik("jan",2000,1900,13,11);
        prac[1]= new Pracownik("adam",2000,1900,13,11);
        prac[2]= new Pracownik("grzes",2000,1900,13,11);


        Integer [] ints = {1, 2, 3};

        MyIterable<Pracownik> myList = new MyIterable<>(prac);

        for (Pracownik i : myList) {

            System.out.println(i);
        }
    }
}
