package pl.imijad.Dybowski;

public class Adres {

    Adres(String ul,int nd,String mias,String kp)
    {
        this.ulica=ul;
        this.numer_domu=nd;
        this.miasto=mias;
        this.kod_pocztowy=kp;
    }
    Adres(String ul,int nd,int nm,String mias,String kp)
    {
        this.ulica=ul;
        this.numer_domu=nd;
        this.numer_mieszkania=nm;
        this.miasto=mias;
        this.kod_pocztowy=kp;
    }
    public void pokaz()
    {
        System.out.println(kod_pocztowy+" "+miasto);
        if(numer_mieszkania>0)
            System.out.println(ulica+" "+numer_domu+"/"+numer_mieszkania);
        else
            System.out.println(ulica+" "+numer_domu);
    }
    public boolean przed(Adres adres)
    {

     for(int i=0;i<6;i++)
     {
         if(this.kod_pocztowy.charAt(i)<adres.kod_pocztowy.charAt(i))
             return true;
         else if(this.kod_pocztowy.charAt(i)>adres.kod_pocztowy.charAt(i))
             return false;
     }
     return false;
    }

    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;
}
