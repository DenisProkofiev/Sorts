import jdk.swing.interop.SwingInterOpUtils;
import randomizer.Randomizer;
import sorts.BubbleSort;
import sorts.InsertionSort;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Executor;

public class TestClass {
    public static int count = 0;

    public static void main(String[] args) {
        int[] arr = {123,54,10,6,124,56};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));

        System.out.println(TestClass.bs(arr, 10, 0, arr.length - 1));

    }

    private static int bs(int[] arr, int key, int start, int finish) {
        int mid = start + (finish - start) / 2;

        if (start > finish) {
            return -1;
        } else if (key < arr[mid]) {
            return bs(arr, key, start, mid - 1);
        } else if (key > arr[mid]) {
            return bs(arr, key, mid + 1, finish);
        } else
            return mid;
    }


}
