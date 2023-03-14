package home005;
/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */
public class MainEx01 {
    public static void main(String[] args) {
        BookEx01 phoneBook = new BookEx01();
        
        phoneBook.addNum("Mom", 1234);
        phoneBook.addNum("Dad", 5678);
        phoneBook.addNum("Bob", 1001);
        phoneBook.addNum("Mom", 4321);
        phoneBook.printBook();
        phoneBook.printNum("Mom");
        phoneBook.printNum("Wow");
    }
}
