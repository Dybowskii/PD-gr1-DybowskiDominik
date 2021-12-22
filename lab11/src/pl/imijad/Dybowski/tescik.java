package pl.imijad.Dybowski;
import java.time.LocalDate;

public class tescik {
    public tescik() {
    }

    public static void main(String[] args) {
        Integer[] sortedInts = new Integer[]{5, 7, 94, 901, 901, 901, 5236};
        Integer[] unsortedInts = new Integer[]{7246, 901, 9, 523};
        LocalDate[] sortedDates = new LocalDate[]{LocalDate.of(2020, 8, 2), LocalDate.of(2020, 10, 16), LocalDate.of(2020, 11, 21), LocalDate.of(2021, 4, 13)};
        LocalDate[] unsortedDates = new LocalDate[]{ LocalDate.of(1999, 11, 3), LocalDate.of(1999, 11, 2), LocalDate.of(1999, 11, 1)};
        System.out.println(tescik.ArrayUtil.isSorted(sortedInts));
        System.out.println(tescik.ArrayUtil.isSorted(unsortedInts));
        System.out.println(tescik.ArrayUtil.isSorted(sortedDates));
        System.out.println(tescik.ArrayUtil.isSorted(unsortedDates));
        System.out.println(tescik.ArrayUtil.binSearch(sortedInts, 94));
        System.out.println(tescik.ArrayUtil.binSearch(sortedInts, 6));

        for (int i=0;i<unsortedInts.length;i++)
        {
            System.out.print(unsortedInts[i]+" ");
        }
        System.out.println(" ");
        Integer[] unsortedInts2 = tescik.ArrayUtil.SelectionSort(unsortedInts);
        for (int i=0;i<unsortedInts2.length;i++)
        {
            System.out.print(unsortedInts2[i]+" ");
        }
        System.out.println(" ");
        LocalDate[] data= (LocalDate[]) ArrayUtil.SelectionSort(unsortedDates);
        for (int i=0;i<data.length;i++)
        {
            System.out.println(data[i]+" ");
        }
    }

    static class ArrayUtil<T> {
        ArrayUtil() {
        }

        public static <T extends Comparable<T>> boolean isSorted(T[] array) {
            for(int i = 0; i < array.length - 1; ++i) {
                if (array[i + 1].compareTo(array[i]) < 0) {
                    return false;
                }
            }

            return true;
        }

        public static <T extends Comparable<T>> int binSearch(T[] array, T obiekt) {
            for(int i = 0; i < array.length; ++i) {
                if (array[i].equals(obiekt)) {
                    return i;
                }
            }

            return -1;
        }
        public  static <T extends Comparable<T>> T[] SelectionSort(T[] array)
        {

            for (int i=0;i<array.length;i++)
            {
                int min=i;
                for (int j=i;j<array.length;j++)
                    if(array[j].compareTo(array[min])<0)
                        min=j;
                T temp=array[min];
                array[min]=array[i];
                array[i]=temp;

            }
            return array;
        }

    }
}