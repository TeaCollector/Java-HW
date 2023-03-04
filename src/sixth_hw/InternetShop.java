package sixth_hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InternetShop {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static List<NoteBook> listOfBook;

    public static void main(String[] args) throws IOException {
        NoteBook apple = new NoteBook("MACAIR", "MacOS", "Red", 8, 500);
        NoteBook acer = new NoteBook("ACER", "Windows", "White", 16, 500);
        NoteBook samsung = new NoteBook("Samsung", "Linux", "Black", 4, 250);
        NoteBook lenovo = new NoteBook("Lenovo", "Windows", "Grey", 2, 100);
        NoteBook asus = new NoteBook("Asus", "Windows", "Black", 16, 750);
        listOfBook = new ArrayList<>(Arrays.asList(acer, apple, asus, lenovo, samsung));
        welcome();
    }


    public static void welcome() throws IOException {
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello Dear Friend welcome to the shop, please input which properties of notebook you want to choose\n" +
                "1 - RAM\n" +
                "2 - HDD\n" +
                "3 - Operating System\n" +
                "4 - Color\n" +
                "What you choose: ");
        String wishes = bufferedReader.readLine();
        switch (wishes) {
            case "1" -> {
                System.out.println("PLease input how much RAM you interest: 2, 4, 8, 16 GB: ");
                int RAM = Integer.parseInt(bufferedReader.readLine());
                RAMFilter(RAM);
            }
            case "2" -> {
                System.out.println("PLease input how much HDD you interest: 100, 250, 500, 750 GB: ");
                int RAM = Integer.parseInt(bufferedReader.readLine());
                HDDFilter(RAM);
            }
            case "3" -> {
                System.out.println("PLease input which Operating System you interest: Linux, Windows, MacOS: ");
                String OperSystem = bufferedReader.readLine();
                OSFilter(OperSystem);
            }
            case "4" -> {
                System.out.println("PLease input which color you interest: Red, Black, Grey, White: ");
                String color = bufferedReader.readLine();
                ColorFilter(color);
            }

            default -> System.out.println("Sorry, we don't have any filter in our shop");
        }
    }

    private static void ColorFilter(String color) {
        listOfBook
                .stream()
                .filter(v -> v.getColor().equals(color))
                .forEach(System.out::println);
    }

    private static void OSFilter(String OperSystem) {
        listOfBook
                .stream()
                .filter(v -> v.getOS().equals(OperSystem))
                .forEach(System.out::println);
    }

    private static void HDDFilter(int HDD) {
        listOfBook
                .stream()
                .filter(v -> v.getHDD() == HDD)
                .forEach(System.out::println);
    }

    private static void RAMFilter(int RAM) {
        listOfBook
                .stream()
                .filter(v -> v.getRAM() == RAM)
                .forEach(System.out::println);
    }

}
