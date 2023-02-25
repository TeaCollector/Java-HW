package fourth_hw;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task_1 {
    public static <T> List<T> reversedList(List<T> list) {
        List<T> reversedList = new LinkedList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
    public static void main(String[] args) {
        LinkedList<String> list = (LinkedList<String>)reversedList(List.of("Hello", "World", "Wonderful", "Pretty"));
        System.out.println(list);
    }
}
