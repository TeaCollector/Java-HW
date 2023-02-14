package Second_HW;

/* Дана строка (получение через обычный текстовый файл!!!)

        "фамилия":"Иванов","оценка":"5","предмет":"Математика"
        "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

        Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
        Студент [фамилия] получил [оценка] по предмету [предмет].

        Пример вывода:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.*/

import java.io.*;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("information.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String stringFromFile;
            String result;
            StringBuilder sb = new StringBuilder("Студент ^ получил ^ по предмету ^");
            while ((stringFromFile = br.readLine()) != null) {
                result = "Студент ^ получил ^ по предмету ^";
                String[] array = stringFromFile.replaceAll("\"", "").split("[:,]");
                for(int i = 1;i < array.length; i += 2) {
                    result = result.replaceFirst("\\^", array[i]);
                }
                System.out.println(result);
            }
        }
    }
}
