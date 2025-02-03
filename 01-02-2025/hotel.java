public class hotel {
    
        private String guestName;
        private String roomType;
        private int nights;
       hotel(){
            this("Unknown","Standard",1);
        }
      hotel(String guestName,String roomType,int nights){
            this.guestName=guestName;
            this.roomType=roomType;
            this.nights=nights;}
        hotel(hotel other){
            this.guestName=other.guestName;
            this.roomType=other.roomType;
            this.nights=other.nights;
        }
        void bookingDetails(){
            System.out.println("Guest:"+guestName+", Room Type:"+roomType+", Nights:"+nights);
        }
    }
    
