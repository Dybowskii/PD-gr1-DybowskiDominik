import java.util.TreeMap;
import java.util.ArrayList;
public class zad3 {
    public static class studen implements Comparable<studen>
    {
        public studen(String imie,String nazwisko)
        {
            this.imie=imie;
            this.nazwisko=nazwisko;
            this.id=count;
            count++;
        }

        @Override
        public String toString() {
            return "studen{" +
                    "id=" + id +
                    ", imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    '}';
        }
        private static int count=1;
        int id;
        String imie;
        String nazwisko;
        @Override
        public int compareTo(studen o) {
            if (this.nazwisko.compareTo(o.nazwisko)==0)
            {
                if (this.imie.compareTo(o.imie)==0) {
                    if (this.id==o.id)
                        return 0;
                    else if(this.id>o.id)
                        return 1;
                    else
                        return 0;
                }
                else if(this.imie.compareTo(o.imie)==1)
                    return 1;
                else
                    return -1;
            }
            else if (this.nazwisko.compareTo(o.nazwisko)==1)
                return 1;
            else
                return -1;
        }
    }
    public static void zmien(TreeMap<studen,String> map,int key,String value)
    {
        ArrayList<studen> keys = new ArrayList<>(map.keySet());
        for(int i=0;i<keys.size();i++)
        {
            if(keys.get(i).id==key)
                map.put(keys.get(i),value);
        }
    }
    public static void wypisz(TreeMap<studen,String> map)
    {
        map.forEach((key,value)-> System.out.println(key+":"+value));
    }
    public static void main(String[] args) {
        TreeMap<studen,String> mapa = new TreeMap<studen,String>();
        mapa.put(new studen("Adam","Kowalski"),"dbd");
        mapa.put(new studen("Piotrek","Nowak"),"dbd");
        wypisz(mapa);

        zmien(mapa,2,"np");
        wypisz(mapa);



    }
}
