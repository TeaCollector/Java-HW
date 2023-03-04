package fifth_HW;

/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
   что 1 человек может иметь несколько телефонов.
Добавить функции:
  1) Добавление номера
  2) Вывод всего*/

import org.junit.jupiter.api.Test;

import java.util.*;

public class Task_1 {
    private Map<Users, List<Numbers>> phoneBook;

    public Task_1(Map<Users, List<Numbers>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public static void main(String[] args) {
        Map<Users, List<Numbers>> listMap = new HashMap<>();
        Task_1 task1 = new Task_1(listMap);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Please write the character what you want to do,\nwrite new name: 'w' \n" +
                    "show all phone book: 's': ");
            String action = scan.next();
            switch (action) {
                case "w" -> {
                    System.out.print("PLease input new users: ");
                    String usersName = scan.next();
                    System.out.print("Please input phone number of users: ");
                    String phoneNumber = scan.next();
                    Users users = new Users(usersName);
                    task1.addNumber(users, new Numbers(phoneNumber));
                }
                case "s" -> task1.displayAllBook();
                default -> {
                    System.out.println("Sorry I yet don't know such command try again please.");
                    throw new IllegalArgumentException("See you soon.");
                }
            }
        }
    }

    public void addNumber(Users users, Numbers number) {
        if (phoneBook.containsKey(users)) {
            phoneBook.get(users).add(number);
        } else {
            List<Numbers> list = new ArrayList<>();
            list.add(number);
            phoneBook.put(users, list);
        }
    }

    public void displayAllBook() {
        for (Map.Entry<Users, List<Numbers>> list : phoneBook.entrySet()) {
            System.out.println("Users " + list.getKey() + " and his(her) phone number(s): " + list.getValue());
        }
    }
}

class Users {
    private String name;

    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Numbers {
    private String number;

    public Numbers(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return Objects.equals(number, numbers.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
