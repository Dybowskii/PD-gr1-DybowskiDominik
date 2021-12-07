package pl.imijad.Dybowski;
import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        osoba[] ludzie = new osoba[2];

        ludzie[0] = new Pracownik("Jan", "Kowalski", 50000, LocalDate.of(2000, 10, 10), LocalDate.of(2018, 10, 10), true );
        ludzie[1] = new Student("Malgorzata", " Nowak", "informatyka",4.5,  LocalDate.of(2000, 10, 10), true );
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis() + ": " + p.getData());
        }
    }
}
