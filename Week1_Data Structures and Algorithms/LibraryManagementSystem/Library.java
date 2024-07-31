import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books.get(mid).getTitle().compareToIgnoreCase(title);
            if (cmp == 0) {
                return books.get(mid);
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "1984", "George Orwell");
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee");

        // Add books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        String searchTitleLinear = "1984";
        Book resultLinear = library.linearSearchByTitle(searchTitleLinear);
        System.out.println("Linear Search result for title '" + searchTitleLinear + "': " + (resultLinear != null ? resultLinear : "Book not found"));

        String searchTitleBinary = "To Kill a Mockingbird";
        Book resultBinary = library.binarySearchByTitle(searchTitleBinary);
        System.out.println("Binary Search result for title '" + searchTitleBinary + "': " + (resultBinary != null ? resultBinary : "Book not found"));
    }
}
