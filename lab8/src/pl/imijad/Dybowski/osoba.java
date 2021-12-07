package pl.imijad.Dybowski;

abstract class osoba
{

    public osoba(String imie, String nazwisko, java.time.LocalDate data, boolean plec)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getImie()
    {
        return imie;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public java.time.LocalDate getData()
    {
        return data;
    }
    public boolean getPlec()
    {
        return plec;
    }

    private String nazwisko;
    private String imie;
    private java.time.LocalDate data;
    private boolean plec;
}