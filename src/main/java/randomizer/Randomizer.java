package randomizer;

import java.util.Random;

public class Randomizer {
    public static int[] intRandomizer(int countOfNumbers, int bound) {
        int[] array = new int[countOfNumbers];
        Random random = new Random();

        for (int i = 0; i < countOfNumbers; i++) {
            int number = random.nextInt(bound);
            if (i % 4 == 0)
                array[i] = -number;
            else
                array[i] = number;
        }

        return array;
    }
}
