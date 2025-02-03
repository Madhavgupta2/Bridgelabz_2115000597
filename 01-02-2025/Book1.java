public class Book1 {

        private String title;
        private String author;
        private double price;
        private boolean availability;
        Book1(String title,String author,double price,boolean availability){
            this.title=title;
            this.author=author;
            this.price=price;
            this.availability=availability;
        }
        void borrowBook(){
            if(availability){
                availability=false;
                System.out.println("You've borrowed the book:"+title);
            }else{
                System.out.println("Sorry,the book '"+title+"' is already borrowed.");
            }
        }
        void returnBook(){
            availability=true;
            System.out.println("Book '"+title+"' has been returned.");
        }
    }
    