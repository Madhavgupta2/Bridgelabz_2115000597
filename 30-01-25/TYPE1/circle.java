class circle {
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
    double circumference(){
        return 2*Math.PI*radius;
    }

    void display(){
        System.out.println("Circle Details:");
        System.out.println("Radius:"+radius);
        System.out.println("Area:"+area());
        System.out.println("Circumference:"+circumference());
    }

    
    public static void main(String args[]){
        circle c=new circle(5.0);
        c.display();
    }
}


