// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

package task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, -5, 13, -7, 24, -8, 16};
        replaceNegative(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void replaceNegative(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] >= 10 && numbers[j] <= 99) {
                        sum += j;
                    }
                }
                numbers[i] = sum;
                sum = 0;
            }
        }
    }
}
