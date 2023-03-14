package home005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */
public class BookEx01 {
    
    private Map<String, List<Integer>> book = new HashMap<>();

    void addNum(String nickname, int number) {
        if (book.containsKey(nickname)) {
            List<Integer> list = book.get(nickname);
            list.add(number);

        } else {
            List<Integer> list = new ArrayList<>();
            list.add(number);
            book.put(nickname, list);
        }
    }

    void printBook() {
        System.out.println(book);
    }

    void printNum(String name) {
        if (book.containsKey(name)) {
            System.out.println(book.get(name));
        }
        else System.out.println("not found");
    }

}
