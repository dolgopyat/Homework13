public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book voynaIMir = new Book("Война и Мир", levTolstoy, 2022);
        Book voynaIMir2 = new Book("Война и Мир", levTolstoy, 2022);
        System.out.println(voynaIMir.bookInfo());
        System.out.println(voynaIMir);
        System.out.println(voynaIMir.hashCode() == voynaIMir2.hashCode());
        System.out.println(voynaIMir.equals(voynaIMir2));
    }
}