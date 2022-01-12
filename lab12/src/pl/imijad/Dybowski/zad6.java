package pl.imijad.Dybowski;
import java.util.Collections;
import java.util.Stack;

public class zad6 {
    public static void main(String[] args) {
        Stack<Integer> Stos = new Stack<Integer>();
        Integer n = 2015;
        while (n>0)
        {

            Stos.push(n%10);
            n=n/10;

        }
        System.out.println(Stos);
        while (!Stos.empty())
        {
            System.out.println(Stos.pop());
        }
    }


}
