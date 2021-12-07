package pl.imijad.Dybowski;
class Student extends osoba
{
    public Student(String imie, String nazwisko, String kierunek, double srednia, java.time.LocalDate data, boolean plec)
    {
        super(imie, nazwisko, data, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = srednia;
    }

    public String getOpis()
    {
        return "kierunek studiow: " + kierunek;
    }

    public double getSrednia()
    {
        return sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}