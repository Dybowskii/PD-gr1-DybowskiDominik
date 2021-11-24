package pl.imijad.Dybowski;

public class Main {

    public static void main(String[] args) {
	Punkt pierwszy = new Punkt(5,5);
	pierwszy.show();
	Adres adres1= new Adres("piesza",3,"Morag","14-300");
	Adres adres2= new Adres("prosta",3,2,"Morag", "14-300");
	adres1.pokaz();
		System.out.println(adres1.przed(adres2));
	Nauczyciel adam = new Nauczyciel("nowak","2000",3000);
		System.out.println(adam.toString());

    }

}
