import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class NumberProcessor {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = readNumbersFromFile("src/main/resources/numbers.txt");

        if (numbers.isEmpty()) {
            System.out.println("Файл пуст или не удалось прочитать числа.");
            return;
        }

        int min = _min(numbers);
        int max = _max(numbers);
        int sum = _sum(numbers);
        long mult = _mult(numbers);

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Произведение чисел: " + mult);
    }

    public static ArrayList<Integer> readNumbersFromFile(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        return numbers;
    }

    public static int _min(ArrayList<Integer> numbers) {
        return numbers.stream().min(Integer::compare).orElse(Integer.MIN_VALUE);
    }

    public static int _max(ArrayList<Integer> numbers) {
        return numbers.stream().max(Integer::compare).orElse(Integer.MAX_VALUE);
    }

    public static int _sum(ArrayList<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static long _mult(ArrayList<Integer> numbers) {
        return numbers.stream().mapToLong(i -> i).reduce(1, (a, b) -> a * b);
    }
}
