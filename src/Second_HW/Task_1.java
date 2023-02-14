package Second_HW;

import java.util.Arrays;
import java.util.logging.Logger;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
// {7,4,5,1,0}
public class Task_1 {
    private static Logger log = Logger.getLogger(Task_1.class.getName());
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    log.info("Make swap with two elements:" + array[j] +  " and " + array[j+1]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5,4,2,0,9,5,10,3,0, 0, 0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
