package com.company;

public class Book {
    private int id;
    private String name;
    private String Author;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;
    private String bookBinding;

    public Book(int id, String name, String author, String publishingHouse, int year, int pages, double price, String bookBinding) {
        this.id = id;
        this.name = name;
        Author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bookBinding = bookBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookBinding() {
        return bookBinding;
    }

    public void setBookBinding(String bookBinding) {
        this.bookBinding = bookBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bookBinding='" + bookBinding + '\'' +
                '}';
    }

}




