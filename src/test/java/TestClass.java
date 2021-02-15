import sorts.InsertionSort;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] arr = {1, 6280, 21, 2, 65, 123, -1, 6, -765, 43, 1236, -12, 12299};

       System.out.println(Arrays.toString(InsertionSort.insertionSort(arr)));

    }

}
