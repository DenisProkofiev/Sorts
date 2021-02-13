import Sorts.BubbleSort;

import java.util.Arrays;
import java.util.concurrent.Executor;

public class TestClass  {
    public static void main(String[] args) {
        int[]arr = {1,65,123,1,6,765,43,1236,12};

        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));

    }

}
