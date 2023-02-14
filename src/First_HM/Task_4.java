package First_HM;

// Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_4 {

    public static List<String> toList (String[] array) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < array.length; i += 2) {
            list.add(array[i]);
        }
        return list;
    }

    public static List<Integer> transformationToInt(List<String> list) {
        List<Integer> listOfNumber = new ArrayList<>();
        for(String s: list) {
            int number = Integer.parseInt(s);
            listOfNumber.add(number);
        }
        return listOfNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input regex like 'q + w = e' : ");
        String inputString = scanner.nextLine();
        String[] arrayString = inputString.split(" ");

        int counterFirstNumber = 0;
        int counterSecondNumber = 0;

        List<String> listOfString = toList(arrayString);
        System.out.println("List with only number: " + listOfString);
        for(int i = 0; i < 2; i++) {
            String toSearch = listOfString.get(i);
            for(int j = 0; j < toSearch.length(); j++) {
                char question = '?';
                if(i == 0) {
                    if (toSearch.charAt(j) == question) {
                        String newStr = toSearch.replace('?', '0');
                        counterFirstNumber++;
                        listOfString.set(i, newStr);
                    }
                }  else {
                    if (toSearch.charAt(j) == question) {
                        String newStr = toSearch.replace('?', '0');
                        counterSecondNumber++;
                        listOfString.set(i, newStr);
                    }
                }
            }
        }
        List<Integer> listOfNumber = transformationToInt(listOfString);
        System.out.println("List of integer: " + listOfNumber);
        int difference = Math.abs(listOfNumber.get(0) + listOfNumber.get(1) - listOfNumber.get(2));
        System.out.println("Difference between left and right part: " + difference);
        int sumOfTwoCounter = counterFirstNumber + counterSecondNumber;

//        ниже, попытка сделать код более универсальным, не получилось,
//        код работает только с примером в условии и немного похожим.

//        while(sumOfTwoCounter-- > 0) {
//            int lastDigits = (char)difference % 10;
//            char c = (char)lastDigits;
//            difference /= 10;
//            for(int j = 1; j != 0; j--) {
//                String s = listOfString.get(j);
//                for(int i = s.length() - 1; i >= 0; i--){
//                    if('?' == s.charAt(i)) {
//                        String newString = s.replace( '?' ,c);
//                        listOfString.set(j, newString);
//                    }
//                }
//            }
//
//        }

        System.out.println("List after modifying " +  listOfString);
        int firstUnknown = difference / 10;
        System.out.println("firstUnknown = " + firstUnknown);
        int secondUnknown = difference % 10 * 10;
        System.out.println("secondUnknown = " + secondUnknown);

        String stringBuilder = (listOfNumber.get(0) + firstUnknown) +
                " + " +
                (listOfNumber.get(1) + secondUnknown) +
                " = " +
                listOfNumber.get(2);
        System.out.println("counterFirstNumber: " + counterFirstNumber);
        System.out.println("counterSecondNumber: " + counterSecondNumber);
        System.out.println("Correct is: \n" + stringBuilder);
    }
}
