package Second_HW;

import java.util.Scanner;
import java.util.logging.Logger;

public class Task_4 {
    private static Logger log = Logger.getLogger(Task_1.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Action : ");
        String s = scanner.next();
        System.out.print("Second number: ");
        int secondNum = scanner.nextInt();
        scanner.close();
        int result = 0;
        switch (s) {
            case "+" -> System.out.println(result = firstNum + secondNum);
            case "-" -> System.out.println(result = firstNum - secondNum);
            case "/" -> System.out.println(result = firstNum / secondNum);
            case "*" -> System.out.println(result = firstNum * secondNum);
            default -> throw new ArithmeticException("You enter not correct action");
        }
        log.info("You enter first number: " + firstNum +
                "\n You enter action: " + s +
                "\n You enter second number: " + secondNum +
                "\n The result is: " + result);
    }
}
