package third_hw;

import java.util.*;
import java.util.stream.Collectors;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 30; i++) list.add(random.nextInt(100));
        list.stream().filter(x -> x % 2 == 1).forEach(System.out::println);
    }
}
