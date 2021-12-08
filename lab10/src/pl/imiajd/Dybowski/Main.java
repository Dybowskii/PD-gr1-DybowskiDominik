package pl.imiajd.Dybowski;
import  java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class Main {



    public static void main(String[] args) {
    ArrayList<Osoba>  tab = new ArrayList<Osoba>();
	tab.add(new Osoba("nowak", LocalDate.of(2000,2,12)));
	tab.add(new Osoba("Kowalski", LocalDate.of(2000,2,12)));
	tab.add(new Osoba("Adamowicz", LocalDate.of(1990,3,7)));
	tab.add(new Osoba("Adamowicz", LocalDate.of(2001,2,11)));
	tab.add(new Osoba("Dybowski", LocalDate.of(2000,3,19)));
	for (int i=0;i<tab.size();i++)
    {
        System.out.println(tab.get(i));
    }
        Collections.sort(tab);
        System.out.println("++++++++++++++");
	for (int i=0;i<tab.size();i++)
        {
            System.out.println(tab.get(i));
        }
    Student stu1=new Student("Kami", LocalDate.of(2000,12,12),4);
	Student stu2=new Student("Kami", LocalDate.of(2000,12,12),4);
        System.out.println(stu2.compareTo(stu1));



    }
}
