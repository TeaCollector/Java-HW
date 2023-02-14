package First_HM;

// Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Action : ");
        String s = scanner.next();
        System.out.print("Second number: ");
        int secondNum = scanner.nextInt();
        switch (s) {
            case "+" -> System.out.println(firstNum + secondNum);
            case "-" -> System.out.println(firstNum - secondNum);
            case "/" -> System.out.println(firstNum / secondNum);
            case "*" -> System.out.println(firstNum * secondNum);
            default -> throw new ArithmeticException("You enter not correct action");
        }
    }
}
