import jdk.swing.interop.SwingInterOpUtils;
import randomizer.Randomizer;
import sorts.InsertionSort;

import java.util.*;
import java.util.concurrent.Executor;

public class TestClass {
    public static int count = 0;
    public static void main(String[] args) {
        int[] arr = Randomizer.intRandomizer(10, 100);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(InsertionSort.insertionSort(arr)));


        }

}
