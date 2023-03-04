package fifth_HW;

/* Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени. */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_2 {
    public static void main(String[] args) {
        String nameList =
                "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] array = nameList.split(" ");
        Map<String, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < array.length; i += 2) {
            map.compute(array[i], (k, v) -> (v == null) ? 1 : ++v);
        }
        List<Map.Entry<String, Integer>> list = mapToStream(map)
                .sorted((v1, v2) -> v2.getValue() - v1.getValue())
                .collect(Collectors.toList());
        System.out.println(map);
        System.out.println(list);
    }

    private static <K, V> Stream<Map.Entry<K, V>> mapToStream(Map<K, V> map) {
        return map.entrySet().stream();
    }
}
