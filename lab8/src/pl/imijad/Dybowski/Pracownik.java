package pl.imijad.Dybowski;

class Pracownik extends osoba
{
    public Pracownik(String imie, String nazwisko, double pobory, java.time.LocalDate data, java.time.LocalDate dataZatr, boolean plec)
    {
        super(imie, nazwisko, data, plec );
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatr;
    }



    public double getPobory()
    {
        return pobory;
    }

    public java.time.LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
    private java.time.LocalDate dataZatrudnienia;
}
