package pl.imiajd.Dybowski;

import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("jan","kowalski", LocalDate.of(1990,3,4),true,5000);
        ludzie[1] = new Pracownik("jan","kowalski",LocalDate.of(1995,12,24),true,5000);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}





