package ru.jevo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Tele {

    String surname;
    String phone;
    static HashMap<String, String> note = new HashMap<>();

    public static HashMap<String, String> getNote() {
        return note;
    }

    public static void add(String surname, String phone) {
        note.put(phone, surname);
    }

    public static ArrayList<String> get(String searchSurname) {
        ArrayList<String> finded = new ArrayList<>();
        Set<Entry<String, String>> set = note.entrySet();
        for (Map.Entry<String, String> o : set) {
            if (o.getValue().equals(searchSurname))
                finded.add(o.getKey());
        }
        if (finded.size() == 0)
            System.out.println("Абонент отсутствует в справочниике");
        return finded;
    }

    public static void telePrint(String surname) {
        System.out.print("Телефон абонента " + surname + ": ");
        System.out.println(Tele.get(surname));
    }
}
