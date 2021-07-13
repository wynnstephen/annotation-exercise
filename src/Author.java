import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Author extends Person {
    private final List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
