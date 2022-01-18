import java.util.TreeMap;
import java.util.ArrayList;

public class zad2 {
    public static void  dodaj(TreeMap map,String key,String value)
    {
        map.put(key,value);
    }
    public static void zmien(TreeMap map,String key,String value)
    {
        map.put(key,value);
    }
    public static void wypisz(TreeMap map)
    {
        map.forEach((key,value)-> System.out.println(key+":"+value));
    }
    public static void main(String[] args) {
        TreeMap<String,String> mapa = new TreeMap<String,String>();
        dodaj(mapa,"ala","bd");
        dodaj(mapa,"ada","bdb");
        dodaj(mapa,"tomek","ndsb");
        dodaj(mapa,"darek","bdb");
        zmien(mapa,"ala","ndst");
        wypisz(mapa);



    }

}
