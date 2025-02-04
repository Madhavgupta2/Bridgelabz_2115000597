public class Book {
    static String libraryName="centre libarary";
    static void displayLibraryName(){
        System.out.println(libraryName);
    }
    String title;
    String author;
   final int isbn;
    Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;


    }
    void display(){
        if(this instanceof Book){
            System.out.println("title"+title);
            System.out.println("author"+author);
            System.out.println("isbn"+isbn);


        }
    }
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1=new Book("science","hc.verma",123324);
        Book b2=new Book("maths", "rd sharma", 832973);
        b1.display();
        b2.display();

    }
    

}
