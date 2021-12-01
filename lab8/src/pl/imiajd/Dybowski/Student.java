package pl.imiajd.Dybowski;

class Student extends Osoba
{
    public Student(String imiona,String nazwisko,java.time.LocalDate dataUrodzenia,boolean plec, String kierunek,double sredniaOcen)
    {
        super(imiona,nazwisko,dataUrodzenia,plec);
        this.kierunek = kierunek;
        this.sredniaOcen=sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen()
    {
        return sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}