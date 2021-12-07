package pl.imijad.Dybowski;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class terstIntsrument {
    public static void main(String[]args){
        ArrayList<instrument> orkiestra = new ArrayList<instrument>();
        orkiestra.add(new fortepian("bsia", LocalDate.of(2010, 11, 30)));
        orkiestra.add(new skrzypce("jacek", LocalDate.of(1999, 12, 23)));
        orkiestra.add(new flet("tamaha", LocalDate.of(2000, 05, 30)));
        orkiestra.add(new skrzypce("gabriel", LocalDate.of(1990, 05, 30)));
        orkiestra.add(new flet("jojo", LocalDate.of(2000, 10, 10)));
        for (int i = 0; i<orkiestra.size(); i++)
        {
            orkiestra.get(i).dzwiek();
        }
        System.out.println(orkiestra.get(0).toString());
//        System.out.println(flecisko.equals(flecisko));
    }
}