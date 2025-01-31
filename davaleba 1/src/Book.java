import java.util.Objects;

public class Book {
    private String title;
    private int pageCount;
    private String genre;
    private Writer author;

    public Book(String title, int pageCount, String genre, Writer author) {
        this.title = title;
        this.pageCount = pageCount;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return pageCount == book.pageCount &&
                Objects.equals(title, book.title) &&
                Objects.equals(genre, book.genre) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount, genre, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Pages=" + pageCount +
                ", Genre='" + genre + '\'' +
                ", Author=" + author +
                '}';
    }
}
