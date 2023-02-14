package First_HM;//Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task_1 {
    public static int factorial(int n) {
        if(n == 1) return n;
        return n * factorial(n - 1);
    }
    public static int n_triangle(int n) {
        if(n == 1) return n;
        return n + n_triangle(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the number: ");
        int number = scanner.nextInt();
        int fact = factorial(number);
        System.out.println("Factorial = " + fact);
        fact = n_triangle(number);
        System.out.println("N_triangle = " + fact);

    }
}


