package pl.imiajd.Dybowski;

class Pracownik extends Osoba
    {
        public Pracownik(String imiona,String nazwisko,java.time.LocalDate dataUrodzenia, boolean plec, double pobory )
        {
            super(imiona,nazwisko,dataUrodzenia,plec);
            this.pobory = pobory;

        }

        public double getPobory()
        {
            return pobory;
        }

        public String getOpis()
        {
            return String.format("pracownik z pensją %.2f zł", pobory);
        }

        private double pobory;

    }


