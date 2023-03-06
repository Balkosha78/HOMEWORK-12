public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Фёдор", "Достоевский");
        Book warAndPeas = new Book("Война и мир", 1967, author);
        Book crimeAndPunishment = new Book("Преступление и наказание", 1866, author1);
        System.out.println(crimeAndPunishment.getAuthor() + crimeAndPunishment.getName() + crimeAndPunishment.getPublicationYear());
        System.out.println(warAndPeas.getAuthor() + warAndPeas.getName() + warAndPeas.getPublicationYear());
    }
}