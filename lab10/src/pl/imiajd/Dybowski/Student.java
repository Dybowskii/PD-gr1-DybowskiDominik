package pl.imiajd.Dybowski;

import java.time.LocalDate;

class Student extends Osoba implements Cloneable,Comparable {
    public Student(String nazwisko, LocalDate dataurodzenia,double sredniaOcen){

        super(nazwisko,dataurodzenia);
        this.sredniaOcen=sredniaOcen;


    }

    @Override
    public int compareTo(Object o) {
        Student  other = (Student) o;
        if (this.nazwisko==other.nazwisko)
        {
            if(this.dataurodzenia.isEqual(other.dataurodzenia))
                return 0;
            else
                return 1;
        }
        return 1;


    }

    private double sredniaOcen;
}
