class Book{
    String title;int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;this.publicationYear=publicationYear;
    }
    void displayInfo(){
        System.out.println("Title: "+title+", Publication Year: "+publicationYear);
    }
}
class Author extends Book{
    String name,bio;
    Author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name=name;this.bio=bio;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author: "+name+", Bio: "+bio);
    }
}
public class LibraryManagement{
    public static void main(String[] args){
        Author book=new Author("To Kill a Mockingbird",1960,"Harper Lee","American novelist known for her classic novel.");
        book.displayInfo();
    }
}
