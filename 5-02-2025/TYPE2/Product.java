import java.util.ArrayList;
import java.util.List;

public class Product {
    String productName;
    double price;
    
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    
    void displayProduct() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();
    
    Order(int orderId) {
        this.orderId = orderId;
    }
    
    void addProduct(Product product) {
        products.add(product);
    }
    
    void displayOrder() {
        System.out.println("Order ID: " + orderId + " contains:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
    
    double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();
    
    Customer(String name) {
        this.name = name;
    }
    
    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }
    
    void displayOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.displayOrder();
            System.out.println("Total: $" + order.calculateTotal());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);
        
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product3);
        
        Order order2 = new Order(102);
        order2.addProduct(product2);
        
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);
        
        customer1.displayOrders();
        customer2.displayOrders();
    }
}
