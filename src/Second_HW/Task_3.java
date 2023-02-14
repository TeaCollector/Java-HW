package Second_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Напишите метод, который принимает на вход строку (String)
         и определяет, является ли строка палиндромом (возвращает boolean значение). */

public class Task_3 {
    public static boolean isPalindrome(String string) {
        boolean result = true;
        if(string.equals("")) throw new RuntimeException("You enter null(nothing)");
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != string.charAt(string.length() - 1 - i))
                return false;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("PLease input the string to check for palindrome: ");
        String s = br.readLine();
        System.out.println(isPalindrome(s));

    }
}
