import java.util.LinkedList;
import java.util.List;

public class ListTester {
    List<Book> bookList = new LinkedList<>();

    public ListTester(List bookList){
        this.bookList = bookList;
    }

    public void test(int iterations){
        long start;
        long end;
        long lastDelSum = 0;
        long firstDelSum = 0;
        long lastAddSum = 0;
        long firstAddSum = 0;
        Book bookToDelete = bookList.get(0);

        System.out.println("Size of list: " + bookList.size());

        for(int i = 0; i < iterations; i++) {
            start = System.nanoTime();
            bookToDelete = bookList.get(bookList.size() - 1);
            bookList.remove(bookToDelete);
            end = System.nanoTime();

            lastDelSum = lastDelSum + (end - start);

            start = System.nanoTime();
            bookToDelete = bookList.get(0);
            bookList.remove(bookToDelete);
            end = System.nanoTime();

            firstDelSum = firstDelSum + (end - start);

            start = System.nanoTime();
            bookList.add(bookList.size() - 1, new Book("aa", "tt"));
            end = System.nanoTime();

            lastAddSum = lastAddSum + (end - start);

            start = System.nanoTime();
            bookList.add(new Book("aaa", "ttt"));
            end = System.nanoTime();

            firstAddSum = firstAddSum + (end - start);
        }
        System.out.println("Average time spent deleting last object: " + (lastDelSum / 15) + " nanoseconds (number of iterations: " + iterations + ")");
        System.out.println("Average time spent deleting first object: " + (firstDelSum / 15) + " nanoseconds (number of iterations: " + iterations + ")");
        System.out.println("Average time spent adding last object: " + (lastAddSum / 15) + " nanoseconds (number of iterations: " + iterations + ")");
        System.out.println("Average time spent adding first object: " + (firstAddSum / 15) + " nanoseconds (number of iterations: " + iterations + ")");

        System.out.println("Size of list: " + bookList.size());

    }
}
