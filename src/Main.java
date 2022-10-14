public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book voynaIMir = new Book("Война и Мир", levTolstoy, 2022);
        System.out.println(voynaIMir.bookInfo());
    }
}