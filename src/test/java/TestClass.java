import jdk.swing.interop.SwingInterOpUtils;
import randomizer.Randomizer;
import search.BinarySearch;
import sorts.BubbleSort;
import sorts.InsertionSort;
import timemanager.TimeManager;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Executor;

public class TestClass {
    public static int count = 0;

    public static void main(String[] args) {
        int[] arr = {123,54,10,6,124,56};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(InsertionSort.insertionSort(arr)));

    }


}
