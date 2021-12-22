package pl.imijad.Dybowski;


public class PairDemo1 {
    public PairDemo1() {
    }

    public static void main(String[] args) {
        String[] words = new String[]{"Ala", "ma", "psa", "i", "kota"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + (String)mm.getFirst());
        System.out.println("max = " + (String)mm.getSecond());
        PairUtil<String> nn = new PairUtil();
        Pair<String> uu = nn.swapUtil(mm);
        System.out.println("min = " + (String)uu.getFirst());
        System.out.println("max = " + (String)uu.getSecond());
    }
}
class ArrayAlg
{

    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair<String> (min, max);
    }
}