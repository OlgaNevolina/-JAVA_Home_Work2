// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

package task3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8};
        boolean isIncreasing = isIncreasing(numbers);
        System.out.println("Последовательность возрастающая: " + isIncreasing);
    }

    public static boolean isIncreasing(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i-1]) {
                return false;
            }
        }
        return true;
    }
}
