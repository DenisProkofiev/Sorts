package sorts;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array");
            return array;
        }

        if (array.length == 1)
            return array;

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

}