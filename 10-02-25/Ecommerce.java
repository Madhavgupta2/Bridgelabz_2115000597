abstract class Product{
    private int productId;
    private String name;
    private double price;
    public abstract double calculateDiscount();
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}

class Electronics extends Product{
    public double calculateDiscount(){
        return getPrice()*0.1;
    }
}

class Clothing extends Product{
    public double calculateDiscount(){
        return getPrice()*0.2;
    }
}

class Groceries extends Product{
    public double calculateDiscount(){
        return getPrice()*0.05;
    }
}

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}

class ElectronicsTax implements Taxable{
    public double calculateTax(){
        return 0.18;  // 18% Tax on Electronics
    }
    public String getTaxDetails(){
        return "Electronics Tax: 18%";
    }
}

class ClothingTax implements Taxable{
    public double calculateTax(){
        return 0.12;  // 12% Tax on Clothing
    }
    public String getTaxDetails(){
        return "Clothing Tax: 12%";
    }
}

class GroceriesTax implements Taxable{
    public double calculateTax(){
        return 0.05;  // 5% Tax on Groceries
    }
    public String getTaxDetails(){
        return "Groceries Tax: 5%";
    }
}

public class ECommercePlatform{
    public static void main(String[] args){
        Product p1=new Electronics();
        p1.setProductId(101);
        p1.setName("Laptop");
        p1.setPrice(15000);
        Product p2=new Clothing();
        p2.setProductId(102);
        p2.setName("T-shirt");
        p2.setPrice(500);
        Product p3=new Groceries();
        p3.setProductId(103);
        p3.setName("Rice");
        p3.setPrice(100);
        
        Taxable electronicsTax=new ElectronicsTax();
        Taxable clothingTax=new ClothingTax();
        Taxable groceriesTax=new GroceriesTax();
        
        Product[] products={p1,p2,p3};
        for(Product p:products){
            double discount=p.calculateDiscount();
            Taxable tax=null;
            if(p instanceof Electronics) tax=electronicsTax;
            if(p instanceof Clothing) tax=clothingTax;
            if(p instanceof Groceries) tax=groceriesTax;
            
            double taxAmount=p.getPrice()*tax.calculateTax();
            double finalPrice=p.getPrice() + taxAmount - discount;
            System.out.println("Product: "+p.getName()+" Final Price: "+finalPrice);
            System.out.println(tax.getTaxDetails());
        }
    }
}
