package ru.jevo;


import java.util.*;

public class App {
    public static void main(String[] args) {

        // Задание 1
        int count = 0;
        String[] arrCities = {"Москва", "Париж", "Стокгольм", "Петербург", "Севастополь", "Севастополь", "Москва", "Севастополь", "Берлин", "Копенгаген", "Париж", "Женева", "Рим", "Вена", "Рим"};
        HashMap<String, Integer> cCities = new HashMap<>();
        ArrayList<String> allCities = new ArrayList<>(Arrays.asList(arrCities));
        HashSet<String> unicCities = new HashSet<>(Arrays.asList(arrCities));
        System.out.println("Уникальные города: " + unicCities);

        for (String city : allCities) {
            count = (cCities.get(city) == null) ? 0 : cCities.get(city);
            cCities.put(city, count + 1);
        }

        Set<Map.Entry<String, Integer>> set = cCities.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Повторения: ");
        for (Map.Entry<String, Integer> o : list) {
            System.out.println(o.getKey() + " " + o.getValue() + " раз(а)");
        }

        // Задание 2
        String surname;

        Tele.add("Ivanov", "4135678");
        Tele.add("Kostrov", "4115678");
        Tele.add("Patrick", "4105674");
        Tele.add("Bolton", "4135618");
        Tele.add("Raftic", "4135612");
        Tele.add("Ulanova", "4135623");
        Tele.add("Stolyarova", "4133478");
        Tele.add("Petrich", "4135690");
        Tele.add("Voroibyev", "4132618");
        Tele.add("Ivanov", "4135666");
        Tele.add("Patrick", "4195622");
        Tele.add("Patrick", "4195611");

        surname = "Patrick";
        Tele.telePrint(surname);
        surname = "Ivanov";
        Tele.telePrint(surname);
        surname = "Raftic";
        Tele.telePrint(surname);
        surname = "Chvarc";
        Tele.telePrint(surname);


    }


}
