package third_hw;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random(35);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) list.add(random.nextInt(10));
        System.out.println(list);
        System.out.println(list.stream().max(Comparator.comparingInt(x -> x)).get());
//        System.out.println(Collections.max(list));
        System.out.println(list.stream().min(Comparator.comparingInt(x -> x)).get());
//        System.out.println(Collections.min(list));
        double average = list.stream().reduce(0, Integer::sum);
        System.out.println(average/list.size());
    }
}
