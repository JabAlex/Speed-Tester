import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new LinkedList<>();
        Map<Book, String> bookMap = new HashMap<>();

        for(int i = 0; i < 700000; i++){
            bookList.add(new Book("a" + i, "t" + i));
            bookMap.put(new Book("a" + i, "t" + i), "t" + i);
        }
        System.out.println(bookList.size() + " " + bookMap.size());

        ListTester listTester = new ListTester(bookList);
        System.out.println("Testing liked list speed");
        listTester.test(20);

        MapTester mapTester = new MapTester(bookMap);
        mapTester.test(1);

    }
}