package chap13_quiz.q07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Book{
    private String name;
    private int price;

    public Book(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        int total = bookList.stream().mapToInt(Book::getPrice).sum();
        System.out.println("모든 책 가격의 합: " + total);

        String books = bookList.stream()
                .filter(p -> p.getPrice() >= 20000)
                .map(Book::getName)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("2만원 이상인 책 리스트: " + books);
    }

}
