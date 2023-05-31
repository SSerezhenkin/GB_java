import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Task01 {
    
    public static List<Integer> generateRandomArray(int length) {
        List<Integer> result = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.add(rand.nextInt(100) + 1);
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> list = Task01.generateRandomArray(20);

        System.out.println("Оригинальный список: " + list);
        list.removeIf(i -> i % 2 == 0);
        System.out.println("Список без чётных: " + list);
        int min = list.stream().mapToInt(i -> i).min().orElse(Integer.MIN_VALUE);
        int max = list.stream().mapToInt(i -> i).max().orElse(Integer.MAX_VALUE);
        double average = list.stream().mapToInt(i -> i).average().orElse(Double.NaN);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
