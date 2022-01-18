import java.util.PriorityQueue;
import java.util.Scanner;
public class zad1 {
    public static class zadania implements Comparable<zadania> {

        zadania(int priorytet,String opis)
        {
            this.priorytet = priorytet;
            this.opis = opis;
        }
        private int priorytet;
        private String opis;

        @Override
        public int compareTo(zadania o) {
            if (this.priorytet>o.priorytet)
                return 1;
            else if (this.priorytet<o.priorytet)
                return -1;
            else
                return 0;
        }

        @Override
        public String toString() {
            return "zadania{" +
                    "priorytet=" + priorytet +
                    ", opis='" + opis + '\'' +
                    '}';
        }

    }
    public static void  dodaj_priorytet_opis(PriorityQueue kolejka)
    {
        System.out.println("Podaj opis: ");
        Scanner sc = new Scanner(System.in);
        String opis = sc.nextLine();
        System.out.println("Podaj priorytet: ");
        int priorytet = sc.nextInt();
        kolejka.add(new zadania(priorytet, opis));

    }

    public static void nastepne(PriorityQueue kolejka)
    {
        System.out.println(kolejka.poll());
    }

    public static void main(String[] args) {
        PriorityQueue <zadania> kolejka = new PriorityQueue();
        Scanner sc = new Scanner(System.in);
        String tekst = "";
        while(tekst.compareTo("zakoncz")!=0)
        {
            tekst = sc.nextLine();
            if (tekst.compareTo("dodaj priorytet opis")==0)
                dodaj_priorytet_opis(kolejka);
            else if (tekst.compareTo("nastepny") ==0 )
                nastepne(kolejka);
        }


    }
}
