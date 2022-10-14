public class Book {
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
}
