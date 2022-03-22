package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "The Green Mile", "Steven King", "ACT", 1996, 455, 7,"softcover");
        Book book2 = new Book(2, "11/22/63", "Steven King","HarperCollins", 2011, 814, 10.99,"hardcover");
        Book book3 = new Book(3, "It", "Steven King","ACT",1986, 936, 13,"hardcover");
        Book book4 = new Book(4, "Pet Sematary", "Steven King","HarperCollins",1983, 487, 7.50,"softcover");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        Library library = new Library(books);
        library.printAuthor("Steven King");
        library.printYear(2011);
        library.printPublishingHouse("HarperCollins");


    }
}



