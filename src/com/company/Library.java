package com.company;

import java.util.List;

public class Library {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void printAuthor (String Author){
        for (int i = 0; i < books.size(); i++) {
            if (Author.equals(books.get(i).getAuthor()))
                System.out.println(books.get(i));
        }
    }
    public void printYear (Integer year){
        for (int i = 0; i < books.size(); i++) {
            if (year == books.get(i).getYear())
                System.out.println(books.get(i));
        }
    }
    public void printPublishingHouse (String publishingHouse){
        for (int i = 0; i < books.size(); i++) {
            if (publishingHouse.equals(books.get(i).getPublishingHouse()))
                System.out.println(books.get(i));
        }
    }

    public static void main(String[] args) {

    }
    public Library (List<Book> books) {
        this.books = books;
    }
}
