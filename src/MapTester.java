import java.util.HashMap;
import java.util.Map;

public class MapTester {
    Map<Book, String> bookMap = new HashMap<>();

    public MapTester(Map bookMap) {this.bookMap = bookMap;}

    public void test(int iterations){
        long start;
        long end;


        System.out.println("Size of map: " + bookMap.size());

        start = System.nanoTime();
        bookMap.remove(new Book("a395887", "t395887"));
        end = System.nanoTime();

        System.out.println("Time spent deleting object: " + (end - start));

        start = System.nanoTime();
        bookMap.put(new Book("a395887", "t395887"), "t395887");
        end = System.nanoTime();

        System.out.println("Time spent adding object: " + (end - start));
        System.out.println("Size of map: " + bookMap.size());
    }
}
