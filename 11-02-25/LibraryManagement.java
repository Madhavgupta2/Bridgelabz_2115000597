class Book{
    String bookTitle;
    String author;
    String genre;
    int bookID;
    boolean availabilityStatus;
    Book next;
    Book prev;
    public Book(String bookTitle,String author,String genre,int bookID,boolean availabilityStatus){
    this.bookTitle=bookTitle;
    this.author=author;
    this.genre=genre;
    this.bookID=bookID;
    this.availabilityStatus=availabilityStatus;
    this.next=null;
    this.prev=null;
    }
    }
    class LibraryManagement{
    Book head;
    Book tail;
    public LibraryManagement(){
    head=null;
    tail=null;
    }
    public void addBookAtBeginning(String bookTitle,String author,String genre,int bookID,boolean availabilityStatus){
    Book newBook=new Book(bookTitle,author,genre,bookID,availabilityStatus);
    if(head==null){
    head=tail=newBook;
    }else{
    newBook.next=head;
    head.prev=newBook;
    head=newBook;
    }
    }
    public void addBookAtEnd(String bookTitle,String author,String genre,int bookID,boolean availabilityStatus){
    Book newBook=new Book(bookTitle,author,genre,bookID,availabilityStatus);
    if(tail==null){
    head=tail=newBook;
    }else{
    tail.next=newBook;
    newBook.prev=tail;
    tail=newBook;
    }
    }
    public void addBookAtPosition(String bookTitle,String author,String genre,int bookID,boolean availabilityStatus,int position){
    Book newBook=new Book(bookTitle,author,genre,bookID,availabilityStatus);
    if(position==0){
    addBookAtBeginning(bookTitle,author,genre,bookID,availabilityStatus);
    return;
    }
    Book temp=head;
    for(int i=0;i<position-1;i++){
    if(temp==null){
    System.out.println("Position out of range");
    return;
    }
    temp=temp.next;
    }
    if(temp==null||temp.next==null){
    addBookAtEnd(bookTitle,author,genre,bookID,availabilityStatus);
    return;
    }
    newBook.next=temp.next;
    newBook.prev=temp;
    temp.next.prev=newBook;
    temp.next=newBook;
    }
    public void removeBookByID(int bookID){
    if(head==null){
    System.out.println("List is empty");
    return;
    }
    Book temp=head;
    while(temp!=null){
    if(temp.bookID==bookID){
    if(temp.prev!=null){
    temp.prev.next=temp.next;
    }else{
    head=temp.next;
    }
    if(temp.next!=null){
    temp.next.prev=temp.prev;
    }else{
    tail=temp.prev;
    }
    System.out.println("Book with ID "+bookID+" removed");
    return;
    }
    temp=temp.next;
    }
    System.out.println("Book with ID "+bookID+" not found");
    }
    public void searchBookByTitle(String bookTitle){
    Book temp=head;
    while(temp!=null){
    if(temp.bookTitle.equals(bookTitle)){
    System.out.println("Book Found: Title: "+temp.bookTitle+", Author: "+temp.author+", Genre: "+temp.genre+", ID: "+temp.bookID+", Availability: "+(temp.availabilityStatus?"Available":"Not Available"));
    return;
    }
    temp=temp.next;
    }
    System.out.println("Book with Title '"+bookTitle+"' not found");
    }
    public void searchBookByAuthor(String author){
    Book temp=head;
    while(temp!=null){
    if(temp.author.equals(author)){
    System.out.println("Book Found: Title: "+temp.bookTitle+", Author: "+temp.author+", Genre: "+temp.genre+", ID: "+temp.bookID+", Availability: "+(temp.availabilityStatus?"Available":"Not Available"));
    return;
    }
    temp=temp.next;
    }
    System.out.println("Book by Author '"+author+"' not found");
    }
    public void updateBookAvailability(int bookID,boolean availabilityStatus){
    Book temp=head;
    while(temp!=null){
    if(temp.bookID==bookID){
    temp.availabilityStatus=availabilityStatus;
    System.out.println("Availability updated for Book ID "+bookID);
    return;
    }
    temp=temp.next;
    }
    System.out.println("Book with ID "+bookID+" not found");
    }
    public void displayAllBooksForward(){
    if(head==null){
    System.out.println("Library is empty");
    return;
    }
    Book temp=head;
    while(temp!=null){
    System.out.println("Title: "+temp.bookTitle+", Author: "+temp.author+", Genre: "+temp.genre+", ID: "+temp.bookID+", Availability: "+(temp.availabilityStatus?"Available":"Not Available"));
    temp=temp.next;
    }
    }
    public void displayAllBooksReverse(){
    if(tail==null){
    System.out.println("Library is empty");
    return;
    }
    Book temp=tail;
    while(temp!=null){
    System.out.println("Title: "+temp.bookTitle+", Author: "+temp.author+", Genre: "+temp.genre+", ID: "+temp.bookID+", Availability: "+(temp.availabilityStatus?"Available":"Not Available"));
    temp=temp.prev;
    }
    }
    public int countTotalBooks(){
    int count=0;
    Book temp=head;
    while(temp!=null){
    count++;
    temp=temp.next;
    }
    return count;
    }
    }
    public class LibraryApp{
    public static void main(String[] args){
    LibraryManagement library=new LibraryManagement();
    library.addBookAtEnd("The Great Gatsby","F. Scott Fitzgerald","Fiction",1,true);
    library.addBookAtEnd("1984","George Orwell","Dystopian",2,true);
    library.addBookAtBeginning("Moby Dick","Herman Melville","Adventure",3,false);
    library.addBookAtPosition("To Kill a Mockingbird","Harper Lee","Fiction",4,true,2);
    System.out.println("All Books in Forward Order:");
    library.displayAllBooksForward();
    System.out.println("\nAll Books in Reverse Order:");
    library.displayAllBooksReverse();
    System.out.println("\nTotal Books in Library: "+library.countTotalBooks());
    System.out.println("\nSearching for Book by Title '1984':");
    library.searchBookByTitle("1984");
    System.out.println("\nSearching for Book by Author 'Harper Lee':");
    library.searchBookByAuthor("Harper Lee");
    System.out.println("\nUpdating Availability for Book ID 1:");
    library.updateBookAvailability(1,false);
    System.out.println("\nAll Books after Availability Update:");
    library.displayAllBooksForward();
    System.out.println("\nRemoving Book with ID 2:");
    library.removeBookByID(2);
    System.out.println("\nAll Books after Removal:");
    library.displayAllBooksForward();
    }
    }
    