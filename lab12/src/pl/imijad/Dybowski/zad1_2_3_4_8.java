package pl.imijad.Dybowski;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class zad1_2_3_4_8 {
    public static <T> void redukuj(LinkedList<T> Pracownik, int n) {
        int licznik = 0;
        for (int i = 0; i < Pracownik.size(); i++) {
            licznik++;
            if (licznik == n) {
                Pracownik.remove(i);
                licznik = 1;
            }
        }
    }
    public static <T> void odwroc(LinkedList<T>lista)
    {
        LinkedList<T> temp=new LinkedList<T>();
        for (int i=0;i<= lista.size();i++)
        {
            temp.add(lista.getLast());
            lista.removeLast();

        }
        temp.add(lista.get(0));
        lista.removeFirst();
        System.out.println(temp);

        for (int i=0;i<temp.size();i++)
        {
            lista.add(temp.get(i));

        }
        System.out.println(lista);


    }
    public static <T,I extends Iterable<T>> void print(I iterable)
    {
        for ( T i : iterable)
        {
            System.out.print(i+",");
        }
    }


    public static void main(String[] args) {


        Pracownik jeden = new Pracownik("kowalski", 1500, 2000, 12, 3);
        Pracownik dwa = new Pracownik("Adamczyk", 1200, 2000, 12, 3);
        Pracownik trzy = new Pracownik("Jarosz", 1500, 2000, 12, 3);
        Pracownik cztery = new Pracownik("mieczynska", 1200, 2000, 12, 3);
        Pracownik piec = new Pracownik("lewy", 1500, 2000, 12, 3);
        Pracownik szesc = new Pracownik("prawy", 1200, 2000, 12, 3);
        LinkedList<Pracownik> lista = new LinkedList<Pracownik>();

        ArrayList<Pracownik> tab = new ArrayList<Pracownik>();
        lista.add(jeden);
        lista.add(dwa);
        lista.add(trzy);
        lista.add(cztery);
        lista.add(piec);

        lista.add(szesc);
        System.out.println(lista);
        redukuj(lista, 2);
        System.out.println(lista);
        odwroc(lista);
        LinkedList<Integer> ini= new LinkedList<>();
        ini.add(1);
        ini.add(3);
        print(ini);





//        System.out.println(tab.get(0));
//        System.out.println(tab.get(1));
//        tab.sort(Pracownik::compareTo);
//        System.out.println(tab.get(0));
//        System.out.println(tab.get(1));
        }


    }
