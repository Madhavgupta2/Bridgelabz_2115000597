public class book{
class Book{
    String title,author;double price;
    
    Book(String title,String author,double price){
        this.title=title;this.author=author;this.price=price;
    }
    
    void display(){
        System.out.println("Book Details:");
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }

    public static void main(String args[]){
        Book b=new Book("The Alchemist","Paulo Coelho",499.99);
        b.display();
    }
}
}