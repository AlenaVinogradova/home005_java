package home005;

import java.util.*;

/* Пусть дан список сотрудников: 
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, 
Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */
public class ex02 {
    public static void main(String[] args) {
        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " + 
        "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " + 
        "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        sort(s);
    }

    public static void sort(String str) {
        String[] ar = str.split(", ");
        List<String> listNames = new ArrayList<>();
        for (String elem : ar) {
            String[] els = elem.split(" ");            
            listNames.add(els[0]);
        }
        System.out.println(listNames);
        
        /* // Map<Integer, List<String>> tree = new TreeMap<>();

        // List<Object[]> counts = new ArrayList<>();
        // int count = 1;
        // for (int i = 0; i < names.size(); i++) {
        //     count = 1;
        //     for (int j = i + 1; j < names.size(); j++) {
        //         Object[] el = new Object [2];
        //         el[0] = names.get(j);
        //         el[1] = count;
        //         counts.add(el);
        //     }
        // } */

        Map<Integer, List<String>> tree = new TreeMap<>();
        List<String> unique = new ArrayList<>();
        // List<Integer> counts = new ArrayList<>();
        int count = 1;
        for (String name : listNames) {
            if (unique.contains(name)) {
                count ++;

                if(tree.containsKey(count)) {
                    List<String> names = tree.get(count);
                    names.add(name);
                    tree.put(count, names);
                } else {
                List<String> names = new ArrayList<>();
                names.add(name);
                tree.put(count, names);
                }
            } else {
                unique.add(name);
                // System.out.printf("%d, %s \n", count, name);

                count = 1;   
                if(tree.containsKey(count)) {
                    List<String> names = tree.get(count);
                    names.add(name);
                    tree.put(count, names);
                } else {
                List<String> names = new ArrayList<>();
                names.add(name);
                tree.put(count, names);
                }             
            }
            

        }
        System.out.println(tree);
        System.out.println(unique);        
    }
}
