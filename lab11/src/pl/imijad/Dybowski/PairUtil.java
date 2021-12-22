package pl.imijad.Dybowski;

public class PairUtil<T> {
    private T obiekt;

    public PairUtil() {
    }

    public Pair<T> swapUtil(Pair<T> obiekt) {
        return new Pair(obiekt.getSecond(), obiekt.getFirst());
    }
}
