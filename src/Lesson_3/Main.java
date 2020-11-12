package Lesson_3;

import java.util.*;

public class Main
{

    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("hi","vasya","hi",
                "vasya","goodbye","WORA","LIFO","FIFO","hi","WORA","vasya","WORA");
        Set<String> unique = new HashSet<>(collection);
        System.out.println(unique);               // без повторов

        for (Object o : unique)
        {
            System.out.println(o + ": " + Collections.frequency(collection, o)); //подсчет повторов
        }

        PhoneBook phoneBook = new PhoneBook(); // ДЗ 2
        phoneBook.add("Atamqulov","654684");
        phoneBook.add("Nazarbaev","9582374852");
        phoneBook.add("Toqaev","7485247852");
        phoneBook.add("Nazarbaev","817542");
        phoneBook.add("Muhamedi'uly","1872525");
        phoneBook.add("Bai'bek","454857");
        phoneBook.add("Qul-Muhammed","55728275585");
        phoneBook.add("Nazarbaev","5585");
        System.out.println();

        phoneBook.printContact("Nazarbaev");
    }
}

