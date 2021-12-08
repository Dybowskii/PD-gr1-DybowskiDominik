package pl.imiajd.Dybowski;
import java.time.LocalDate;
class Osoba implements Cloneable, Comparable{
    public Osoba(String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.dataurodzenia=dataUrodzenia;
    }



    @Override
    public String toString() {
        return "Osoba"+"["+this.nazwisko+" "+this.dataurodzenia.toString()+"]";
    }
    String nazwisko;
    LocalDate dataurodzenia;

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataurodzenia() {
        return dataurodzenia;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Osoba other = (Osoba) obj;

        if (nazwisko==other.nazwisko)
        {
            if(dataurodzenia.isEqual(other.dataurodzenia))
                return true;
            else
                return false;
        }
        return false;
    }

    public int getcompare(Object o) {
        return compareTo(o);
    }

    @Override
    public int compareTo(Object o) {
        Osoba other = (Osoba) o;
        if (this.nazwisko==other.nazwisko)
        {
            if(this.dataurodzenia.isEqual(other.dataurodzenia))
                return 0;
            else
                return 1;
        }
        return 1;
    }
}
