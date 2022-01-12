package pl.imijad.Dybowski;
import java.util.LinkedList;
import java.lang.Math;


public class zad7 {
    public static void main(String[] args) {
        double n=100;
        LinkedList<Integer> lista= new LinkedList<Integer>();
        for(int i =2;i<=n;i++)
            lista.add(i);
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            for (int j=i;j<lista.size();j++)
            {
                if(lista.get(j)%i==0)
                {
                    lista.remove(j);
                    j--;
                }
            }
        }
        System.out.println(lista);
    }
}
