package pl.imijad.Dybowski;

import java.util.Stack;

public class zad5 {
    public static void main(String[] args) {
        String zdanie = "Ala ma kota. Jej kot lubi myszy.";
        Stack <String> stos = new Stack<>();
        String[] slowa = zdanie.split(" ");
        String schowek;
        int licznik = 0;
        for (int i=0; i<slowa.length; i++)
        {

            int pomoc = slowa[i].length();
            if (slowa[i].charAt(pomoc-1)=='.')
            {
                schowek = slowa[i];
                char temp = schowek.charAt(0);
                String pierwsza = String.valueOf(temp);
                slowa[i]= (pierwsza.toUpperCase() + schowek.substring(1, schowek.length()-1));
                stos.add(slowa[i]);
                String wynik = stos.pop();
                while (!stos.isEmpty())
                {
                    wynik = wynik + " " +  stos.pop();

                }
                wynik = wynik + ".";
                System.out.println(wynik);
            }
            else
                stos.add(slowa[i]);

        }
    }
}