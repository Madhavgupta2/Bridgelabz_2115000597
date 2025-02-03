public class Circle {
  
        private double radius;
        Circle(){
            this(1);
        }
        Circle(double radius){
            this.radius=radius;
        }
        double area(){
            return 3.14*radius*radius;
        }
        double circumference(){
            return 2*3.14*radius;
        }
    }
    

