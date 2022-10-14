public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author(name: "Лев", surname: "Толстой");
        Author stephenKing = new Author(name: "Стивен", surname: "Кинг");
        Book voynaIMir = new Book(title: "Война и Мир", levTolstoy, publikationYear: 2022);
        Book siyanie = new Book(title: "Сияние", stephenKing, publikationYear: 2020);
        System.out.println("Книга: "+voynaIMir.getTitle()+" Автор:"+voynaIMir.getAuthor().getName()+" "+voynaIMir.getAuthor().getsurname()+" Год публикации: "+voynaIMir.getAuthor().publikationYear());