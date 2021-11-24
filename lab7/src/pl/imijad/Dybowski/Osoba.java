package pl.imijad.Dybowski;

class Osoba {
    private String nazwisko;
    private String rokUrodzenia;
    Osoba(String nazw,String rok)
    {
        this.nazwisko=nazw;
        this.rokUrodzenia=rok;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getRokUrodzenia() {
        return rokUrodzenia;
    }
}
class Student extends Osoba{
    private String kierunek;
    Student(String nazw,String rok,String kierunek)
    {
        super(nazw,rok);
        this.kierunek=kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }
   @Override public String  toString()
    {
        return getNazwisko()+" "+getRokUrodzenia()+" "+getKierunek();
    }
}
class Nauczyciel extends Osoba
{
    private int pensja;
    Nauczyciel(String nazw,String rok,int pensja)
    {
        super(nazw,rok);
        this.pensja=pensja;
    }

    public int getPensja() {
        return pensja;
    }
    @Override public String toString()
    {
        return getNazwisko()+" "+getRokUrodzenia()+" "+getPensja();
    }
}
