class Order{
    String orderId,orderDate;
    Order(String orderId,String orderDate){
        this.orderId=orderId;this.orderDate=orderDate;
    }
    String getOrderStatus(){
        return "Order placed";
    }
    void displayInfo(){
        System.out.println("Order ID: "+orderId+", Order Date: "+orderDate+", Status: "+getOrderStatus());
    }
}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(String orderId,String orderDate,String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    String getOrderStatus(){
        return "Shipped, Tracking Number: "+trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(String orderId,String orderDate,String trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    String getOrderStatus(){
        return "Delivered on "+deliveryDate;
    }
}
public class OnlineRetail{
    public static void main(String[] args){
        Order o=new Order("O1001","2025-02-07");
        ShippedOrder s=new ShippedOrder("O1002","2025-02-06","TRK123456");
        DeliveredOrder d=new DeliveredOrder("O1003","2025-02-05","TRK789012","2025-02-07");
        o.displayInfo();
        s.displayInfo();
        d.displayInfo();
    }
}
