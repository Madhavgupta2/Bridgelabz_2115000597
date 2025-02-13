abstract class LibraryItem{
    private String itemId;
    private String title;
    private String author;
    public abstract int getLoanDuration();
    public void getItemDetails(){
        System.out.println("Item ID: "+itemId+" Title: "+title+" Author: "+author);
    }
    public String getItemId(){
        return itemId;
    }
    public void setItemId(String itemId){
        this.itemId=itemId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
}

class Book extends LibraryItem{
    public int getLoanDuration(){
        return 14;  // 14 days loan duration for books
    }
}

class Magazine extends LibraryItem{
    public int getLoanDuration(){
        return 7;  // 7 days loan duration for magazines
    }
}

class DVD extends LibraryItem{
    public int getLoanDuration(){
        return 3;  // 3 days loan duration for DVDs
    }
}

interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}

class BookReservation implements Reservable{
    public void reserveItem(){
        System.out.println("Book reserved successfully.");
    }
    public boolean checkAvailability(){
        return true;  // Assume book is always available for simplicity
    }
}

class MagazineReservation implements Reservable{
    public void reserveItem(){
        System.out.println("Magazine reserved successfully.");
    }
    public boolean checkAvailability(){
        return true;  // Assume magazine is always available for simplicity
    }
}

class DVDReservation implements Reservable{
    public void reserveItem(){
        System.out.println("DVD reserved successfully.");
    }
    public boolean checkAvailability(){
        return true;  // Assume DVD is always available for simplicity
    }
}

public class LibrarySystem{
    public static void main(String[] args){
        LibraryItem item1=new Book();
        item1.setItemId("B123");
        item1.setTitle("Java Programming");
        item1.setAuthor("John Doe");
        
        LibraryItem item2=new Magazine();
        item2.setItemId("M456");
        item2.setTitle("Tech Trends");
        item2.setAuthor("Jane Doe");
        
        LibraryItem item3=new DVD();
        item3.setItemId("D789");
        item3.setTitle("Learning Java");
        item3.setAuthor("Mark Smith");
        
        Reservable bookReservation=new BookReservation();
        Reservable magazineReservation=new MagazineReservation();
        Reservable dvdReservation=new DVDReservation();
        
        LibraryItem[] items={item1,item2,item3};
        for(LibraryItem item:items){
            item.getItemDetails();
            System.out.println("Loan Duration: "+item.getLoanDuration()+" days");
        }
        
        if(bookReservation.checkAvailability()) bookReservation.reserveItem();
        if(magazineReservation.checkAvailability()) magazineReservation.reserveItem();
        if(dvdReservation.checkAvailability()) dvdReservation.reserveItem();
    }
}
