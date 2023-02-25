package fourth_hw;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;

public class Task_2 {
    public static <E> void enqueue(E element, Queue<E> queue) {
        queue.offer(element);
    }

    public static <E> E dequeue(Queue<E> queue) {
        E element = queue.poll();
        return element;
    }

    public static <E> E first(Queue<E> queue) {
        E element = queue.peek();
        return element;
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        enqueue("Hello", queue);
        enqueue("Think", queue);
        enqueue("Running", queue);
        enqueue("World", queue);
        System.out.println(queue);
        System.out.println(dequeue(queue));
        System.out.println(queue);
        System.out.println(first(queue));
    }
}
