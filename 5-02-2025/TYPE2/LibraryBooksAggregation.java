import java.util.ArrayList;

class Book {
String title,author;
Book(String title,String author){
this.title=title;
this.author=author;
}
}

class Library {
ArrayList<Book>books;
Library(){
books=new ArrayList<>();
}
void addBook(Book book){
books.add(book);
}
void displayBooks(){
for(Book book:books){
System.out.println("Title:"+book.title+", Author:"+book.author);
}
}
}

public class LibraryBooksAggregation {
public static void main(String[]args){
Book book1=new Book("1984","George Orwell");
Book book2=new Book("To Kill a Mockingbird","Harper Lee");
Book book3=new Book("The Great Gatsby","F. Scott Fitzgerald");
Library library1=new Library();
Library library2=new Library();
library1.addBook(book1);
library1.addBook(book2);
library2.addBook(book2);
library2.addBook(book3);
System.out.println("Library 1 Books:");
library1.displayBooks();
System.out.println("Library 2 Books:");
library2.displayBooks();
}
}
