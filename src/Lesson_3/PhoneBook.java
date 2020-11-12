package Lesson_3;

import java.util.*;

public class PhoneBook
{

    private final HashMap<String, ArrayList<String>> book;

    PhoneBook()
    {
        this.book = new HashMap<>();
    }

    public void add(String key, String value)
    {
        ArrayList<String> entry = book.getOrDefault(key, new ArrayList<>());
        entry.add(value);
        book.put(key, entry);
    }

    public void printContact(String name)
    {
        System.out.println(name + ":" + "\n" + "- Phone number(s):" +
                " " + book.getOrDefault(name, new ArrayList<>()));
    }
}
