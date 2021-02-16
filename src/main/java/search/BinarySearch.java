package search;

public class BinarySearch {
    //  O(log(N))
    public static int binarySearch(int[] array, int key) {      //O(1)
        int start = 0;
        int finish = array.length - 1;

        while (start <= finish) {
            int mid = start + (finish - start) / 2;
            if (key < array[mid]) {
                finish = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }

    public static int recursionBinarySearch(int[] array, int key, int start, int finish) {          //O(log (N))
        int mid = start + (finish - start) / 2;
        if (start > finish) {
            return -1;

        } else if (key < array[mid]) {
            return recursionBinarySearch(array, key, start, mid - 1);
        } else if (key > array[mid]) {
            return recursionBinarySearch(array, key, mid + 1, finish);
        } else return mid;
    }

}
