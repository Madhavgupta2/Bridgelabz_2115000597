import java.util.*;

class Product {
    private static double discount=0.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID,String productName,double price,int quantity){
        this.productID=productID;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }

    public static void updateDiscount(double newDiscount){
        discount=newDiscount;
    }

    public double getTotalPrice(){
        return(price*quantity)*(1-discount/100);
    }

    public void displayProduct(){
        System.out.println("ID:"+productID+" Name:"+productName+" Price:"+price+" Quantity:"+quantity+" Total Price:"+getTotalPrice());
    }
}

class ShoppingCart{
    private List<Product>cart;

    public ShoppingCart(){
        cart=new ArrayList<>();
    }

    public void addProduct(Object obj){
        if(obj instanceof Product){
            cart.add((Product)obj);
        }
    }

    public void displayCart(){
        for(Product p:cart){
            p.displayProduct();
        }
    }
}

public class Main{
    public static void main(String[]args){
        Product p1=new Product("P001","Laptop",1200.0,1);
        Product p2=new Product("P002","Phone",800.0,2);
        Product.updateDiscount(10);
        ShoppingCart cart=new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.displayCart();
    }
}
