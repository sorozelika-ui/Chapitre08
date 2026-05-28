/*package bookstoread;
import java.util.Collections;
import java.util.List;
public class BookShelf {
    public List<String> books() {
        return Collections.emptyList();
    }

    public void add(String book) {

    }
}

 */

package bookstoread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    private final List<String> books = new ArrayList<>();

    public List<String> books() {
        //return books;

        return Collections.unmodifiableList(books);
    }

   /* public void add(String bookToAdd) {
        books.add(bookToAdd);
    }

    */

    public void add(String... booksToAdd) {
        books.addAll(Arrays.asList(booksToAdd));
    }
}



