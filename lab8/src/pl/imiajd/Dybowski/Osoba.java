package pl.imiajd.Dybowski;

abstract class Osoba
{
    public Osoba(String imiona, String nazwisko,java.time.LocalDate dataUrodzenia,boolean plec )
    {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.dataUrodzenia=dataUrodzenia;
        this.plec=plec;

    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String getImiona()
    {
        return imiona;
    }
    public boolean getPlec()
    {
        return plec;
    }

    private boolean plec;
    private String nazwisko;
    private String imiona;
    private java.time.LocalDate dataUrodzenia;


}