class book{
    String title,author;
    double price;
    book(){
     title="Unknown Title";
     author="Unknown Author";
     price=0.0;
    }
    book(String title,String author,double price){
     this.title=title;
     this.author=author;
     this.price=price;
    }
    void displayInfo(){
     System.out.println("Title:"+title);
     System.out.println("Author:"+author);
     System.out.println("Price:$"+price);
    }
    public static void main(String[] args){
     book book1=new book();
     book1.displayInfo();
     book book2=new book("The Great Gatsby","F. Scott Fitzgerald",10.99);
     book2.displayInfo();
    }
   }
   