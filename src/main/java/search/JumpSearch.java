package search;

public class JumpSearch {
    private static int search(int[] array, int key) {

        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < key) {
            previousStep = jumpStep;
            jumpStep += (int)(Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (array[previousStep] < key) {
            previousStep++;

            if (previousStep == Math.min(jumpStep, arrayLength))
                return -1;
        }

        if (array[previousStep] == key)
            return previousStep;

        return -1;
    }

}
