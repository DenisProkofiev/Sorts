package sorts;

public class MergeSort {

    public static void RecursionMergeSort(int[] array, int arrayLength) {
        if (array == null) {
            System.out.println("Массив пуст!");
        }
        if (arrayLength < 2) {
            return;
        }
        int mid = arrayLength / 2;

        int[] leftSideArray = new int[mid];
        int[] rightArray = new int[arrayLength - mid];

        for (int i = 0; i < mid; i++) {
            leftSideArray[i] = array[i];
        }

        for (int j = mid; j < arrayLength; j++) {
            rightArray[j - mid] = array[j];
        }

        // System.arraycopy(array, 0, leftSideArray, 0, array.length / 2);
        // System.arraycopy(array, array.length / 2, rightArray, 0, array.length - (array.length / 2));
        RecursionMergeSort(leftSideArray, mid);
        RecursionMergeSort(rightArray, arrayLength - mid);

        merge(array, leftSideArray, rightArray, mid, arrayLength - mid);
    }


    private static void merge(int[] array, int[] leftArray, int[] rightArray, int startMid, int midEnd) {
        int i = 0, j = 0, k = 0;
        while (i < startMid && j < midEnd) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < startMid) {
            array[k++] = leftArray[i++];
        }
        while (j < midEnd) {
            array[k++] = rightArray[j++];
        }
    }
}
