// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

package task4;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{10, -5, 13, -7, 24, -8, 16};
        printArray(array);
        replaceNegative(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        String res = "[";
        for (int i = 0; i < array.length; i++) {
            res += array[i] + (i == array.length - 1 ? "]" : ",");
        }
        System.out.println(res);
    }

    private static void replaceNegative(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((10 <= array[i] && array[i] <= 99) || (-99 <= array[i] && array[i] <= -10)) {
                sum += i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sum;
        }

    }
}
