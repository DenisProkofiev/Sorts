import jdk.swing.interop.SwingInterOpUtils;
import sorts.InsertionSort;

import java.util.*;
import java.util.concurrent.Executor;

public class TestClass {
    public static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1, 6280, 21, 2, 65, 123, -1, 72, 6, -765, 43, 1236, -12, 12299};

        System.out.println(Arrays.toString(InsertionSort.insertionSort(arr)));


        }

}
