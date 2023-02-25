package fourth_hw;

// В калькулятор добавьте возможность отменить последнюю операцию.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Task_3 {
    private static Logger log = Logger.getLogger(Task_3.class.getName());
    private static FileHandler fh;

    static {
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        calculator();
    }

    public static void calculator() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        int result = 0;
        boolean flag = true;
        System.out.print("Input first number: ");
        int number1 = scan.nextInt();
        System.out.print("Input the action: ");
        String action = scan.next();
        System.out.print("Input second number: ");
        int number2 = scan.nextInt();
        switch (action) {
            case "+" -> {
                result = number1 + number2;
                System.out.println(result);
                log.addHandler(fh);
            }
            case "-" -> {
                result = number1 - number2;
                System.out.println(result);
                log.addHandler(fh);
            }
            case "*" -> {
                result = number1 * number2;
                System.out.println(result);
                log.addHandler(fh);
            }
            case "/" -> {
                result = number1 / number2;
                System.out.println(result);
                log.addHandler(fh);
            }
        }

        deque.add(result);

        while (flag) {
            System.out.print("Input the action: ");
            action = scan.next();
            if (action.equals("cancel")) {
                deque.removeLast();
                try {
                    result = deque.getLast();
                    System.out.println("You work with number: " + deque.getLast());
                    continue;
                } catch (NoSuchElementException e) {
                    e.getStackTrace();
                }
            }
            System.out.print("Input number: ");
            number2 = scan.nextInt();
            switch (action) {
                case "+" -> {
                    result += number2;
                    System.out.println("Result: " + result);
                    deque.add(result);
                    log.addHandler(fh);
                }
                case "-" -> {
                    result -= number2;
                    System.out.println("Result: " + result);
                    deque.add(result);
                    log.addHandler(fh);
                }
                case "*" -> {
                    result *= number2;
                    System.out.println("Result: " + result);
                    deque.add(result);
                    log.addHandler(fh);
                }
                case "/" -> {
                    result /= number2;
                    System.out.println("Result: " + result);
                    deque.add(result);
                    log.addHandler(fh);
                }
                default -> flag = false;
            }
        }
        System.out.println(deque);
    }
}
