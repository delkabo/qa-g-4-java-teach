package guru.qa;

import java.util.Objects;

public class Book {

        String author = "Камиль";

        String text = "Мурзилка";

        public Book(String author, String text) {
            this.author = author;
            this.text = text;
        }

        public void doReadBook() {
            System.out.println("Книга прочитана " + author);
            System.out.println("Тест");
            System.out.println("Test");
            System.out.println("показывают ");
            System.out.println("Этот метод выполняется ");
        }

        String readBook() {
            return "Книга прочитана readBook() " + author;
        }
        //метод от функции отличается тем что нужен для описания действий объекта


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(text, book.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text);
    }
}
