package pl.imijad.Dybowski;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.LinkedList;


class Pracownik implements Comparable<Pracownik>
{

    public Pracownik (String nazwisko, double pobory, int year, int month, int day)
    {
        this.nazwisko = nazwisko;
        this.pobory = pobory;
        dataZatrudnienia = LocalDate.of(year, month, day);
        id = nextId;
        ++nextId;
    }

    public String nazwisko()
    {
        return nazwisko;
    }

    public double pobory()
    {
        return pobory;
    }

    public LocalDate dataZatrudnienia()
    {
        return dataZatrudnienia;
    }

    public void zwiekszPobory(double procent)
    {
        double podwyżka = pobory * procent / 100;
        pobory += podwyżka;
    }

    public int id()
    {
        return id;
    }

    public void setId()
    {
        id = nextId;
        ++nextId;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public int compareTo(Pracownik other) {
        if (pobory < other.pobory) {
            return -1;
        }
        if (pobory > other.pobory) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "Pracownik "+this.nazwisko+" "+this.pobory;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;

    private int id;
    private static int nextId = 1;


}

