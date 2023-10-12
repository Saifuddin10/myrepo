package MethodOverriding.AllMainExamples;

class Publisher {
    String name;
    String publisherId;
    String city;

    Publisher(String name, String publisherId, String city) {
        this.name = name;
        this.publisherId = publisherId;
        this.city = city;
    }
}

class Author {
    String authorName;
    int age;
    String place;

    Author(String authorName, int age, String place) {
        this.authorName = authorName;
        this.age = age;
        this.place = place;
    }
}

public class Book {
    String name;
    int price;
    Author author;
    Publisher publisher;

    Book(String name, int price, Author author, Publisher publisher) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public static void main(String[] args) {
        Author author = new Author("Harry", 36, "UK");
        Publisher publisher = new Publisher("Ben Publishers", "BHS 2205", "London");
        Book book = new Book("Java for Begginer", 899, author, publisher);
        System.out.println("********************** Book Details ****************************");
        System.out.println("Book name : " + book.name);
        System.out.println("Book price : " + book.price);
        System.out.println("********************** Author Details ****************************");
        System.out.println("Author name : " + book.author.authorName);
        System.out.println("Author age : " + book.author.age);
        System.out.println("Author place : " + book.author.place);
        System.out.println("********************** Publisher Details ****************************");
        System.out.println("Publisher name : " + book.publisher.name);
        System.out.println("Publisher id : " + book.publisher.publisherId);
        System.out.println("Publisher city : " + book.publisher.city);
    }
}