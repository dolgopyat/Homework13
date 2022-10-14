import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int publikationYear;

    public Book(String title, Author author, int publikationYear) {
        this.title = title;
        this.author = author;
        this.publikationYear = publikationYear;
    }
    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublikationYear() {
        return this.publikationYear;
    }
    public void setPublikationYear(int publikationYear) {
        this.publikationYear = publikationYear;
    }
    public String bookInfo() {
        return "Книга: "+this.title+", Автор: "+this.author.getFullName()+", Год публикации: "+this.publikationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publikationYear == book.publikationYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publikationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publikationYear=" + publikationYear +
                '}';
    }
}
