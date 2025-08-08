public class Book {
    String title;
    String author;
    int year;

    Book() {
        title = "Unknown";
        author = "Unknown";
        year = 0;
    }

    Book(String t) {
        title = t;
        author = "Unknown";
        year = 0;
    }

    Book(String t, String a) {
        title = t;
        author = a;
        year = 0;
    }

    Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics");
        Book b3 = new Book("Effective Java", "Joshua Bloch");
        Book b4 = new Book("Clean Code", "Robert C. Martin", 2008);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
 
