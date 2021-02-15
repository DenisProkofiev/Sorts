package sorts;

public class InsertionSort {
    //O(n^2)

    public static int[] insertionSort(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array");
            return array;
        }

        if (array.length == 1)
            return array;


        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        return array;
    }

}
