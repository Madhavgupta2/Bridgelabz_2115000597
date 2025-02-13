class Item{
    String itemName;
    int itemID;
    int quantity;
    double price;
    Item next;
    public Item(String itemName,int itemID,int quantity,double price){
    this.itemName=itemName;
    this.itemID=itemID;
    this.quantity=quantity;
    this.price=price;
    this.next=null;
    }
    }
    class InventoryManagement{
    Item head;
    public InventoryManagement(){
    head=null;
    }
    public void addItemAtBeginning(String itemName,int itemID,int quantity,double price){
    Item newItem=new Item(itemName,itemID,quantity,price);
    newItem.next=head;
    head=newItem;
    }
    public void addItemAtEnd(String itemName,int itemID,int quantity,double price){
    Item newItem=new Item(itemName,itemID,quantity,price);
    if(head==null){
    head=newItem;
    }else{
    Item temp=head;
    while(temp.next!=null){
    temp=temp.next;
    }
    temp.next=newItem;
    }
    }
    public void addItemAtPosition(String itemName,int itemID,int quantity,double price,int position){
    Item newItem=new Item(itemName,itemID,quantity,price);
    if(position==0){
    addItemAtBeginning(itemName,itemID,quantity,price);
    return;
    }
    Item temp=head;
    for(int i=0;i<position-1;i++){
    if(temp==null){
    System.out.println("Position out of range");
    return;
    }
    temp=temp.next;
    }
    newItem.next=temp.next;
    temp.next=newItem;
    }
    public void removeItemByID(int itemID){
    if(head==null){
    System.out.println("List is empty");
    return;
    }
    Item temp=head;
    Item prev=null;
    while(temp!=null){
    if(temp.itemID==itemID){
    if(prev==null){
    head=temp.next;
    }else{
    prev.next=temp.next;
    }
    System.out.println("Item with ID "+itemID+" removed");
    return;
    }
    prev=temp;
    temp=temp.next;
    }
    System.out.println("Item with ID "+itemID+" not found");
    }
    public void updateItemQuantity(int itemID,int newQuantity){
    Item temp=head;
    while(temp!=null){
    if(temp.itemID==itemID){
    temp.quantity=newQuantity;
    System.out.println("Quantity updated for Item ID "+itemID);
    return;
    }
    temp=temp.next;
    }
    System.out.println("Item with ID "+itemID+" not found");
    }
    public void searchItemByID(int itemID){
    Item temp=head;
    while(temp!=null){
    if(temp.itemID==itemID){
    System.out.println("Item Found: Name: "+temp.itemName+", ID: "+temp.itemID+", Quantity: "+temp.quantity+", Price: "+temp.price);
    return;
    }
    temp=temp.next;
    }
    System.out.println("Item with ID "+itemID+" not found");
    }
    public void searchItemByName(String itemName){
    Item temp=head;
    while(temp!=null){
    if(temp.itemName.equals(itemName)){
    System.out.println("Item Found: Name: "+temp.itemName+", ID: "+temp.itemID+", Quantity: "+temp.quantity+", Price: "+temp.price);
    return;
    }
    temp=temp.next;
    }
    System.out.println("Item with Name "+itemName+" not found");
    }
    public double calculateTotalValue(){
    double totalValue=0;
    Item temp=head;
    while(temp!=null){
    totalValue+=temp.price*temp.quantity;
    temp=temp.next;
    }
    return totalValue;
    }
    public void sortInventoryByName(){
    if(head==null||head.next==null){
    return;
    }
    head=mergeSortByName(head);
    }
    private Item mergeSortByName(Item head){
    if(head==null||head.next==null){
    return head;
    }
    Item mid=getMiddle(head);
    Item secondHalf=mid.next;
    mid.next=null;
    return merge(mergeSortByName(head),mergeSortByName(secondHalf));
    }
    private Item merge(Item first,Item second){
    if(first==null){
    return second;
    }
    if(second==null){
    return first;
    }
    if(first.itemName.compareTo(second.itemName)<0){
    first.next=merge(first.next,second);
    first.next.prev=first;
    first.prev=null;
    return first;
    }else{
    second.next=merge(first,second.next);
    second.next.prev=second;
    second.prev=null;
    return second;
    }
    }
    public void sortInventoryByPrice(){
    if(head==null||head.next==null){
    return;
    }
    head=mergeSortByPrice(head);
    }
    private Item mergeSortByPrice(Item head){
    if(head==null||head.next==null){
    return head;
    }
    Item mid=getMiddle(head);
    Item secondHalf=mid.next;
    mid.next=null;
    return mergePrice(mergeSortByPrice(head),mergeSortByPrice(secondHalf));
    }
    private Item mergePrice(Item first,Item second){
    if(first==null){
    return second;
    }
    if(second==null){
    return first;
    }
    if(first.price<second.price){
    first.next=mergePrice(first.next,second);
    return first;
    }else{
    second.next=mergePrice(first,second.next);
    return second;
    }
    }
    public void displayInventory(){
    if(head==null){
    System.out.println("Inventory is empty");
    return;
    }
    Item temp=head;
    while(temp!=null){
    System.out.println("Item Name: "+temp.itemName+", Item ID: "+temp.itemID+", Quantity: "+temp.quantity+", Price: "+temp.price);
    temp=temp.next;
    }
    }
    }
    public class InventoryApp{
    public static void main(String[] args){
    InventoryManagement inventory=new InventoryManagement();
    inventory.addItemAtEnd("Item1",1,10,15.5);
    inventory.addItemAtEnd("Item2",2,5,25.0);
    inventory.addItemAtBeginning("Item3",3,7,12.0);
    inventory.addItemAtPosition("Item4",4,20,10.0,2);
    System.out.println("Inventory:");
    inventory.displayInventory();
    System.out.println("\nTotal Inventory Value: "+inventory.calculateTotalValue());
    inventory.sortInventoryByName();
    System.out.println("\nSorted by Item Name:");
    inventory.displayInventory();
    inventory.sortInventoryByPrice();
    System.out.println("\nSorted by Item Price:");
    inventory.displayInventory();
    System.out.println("\nUpdating Quantity of Item with ID 2:");
    inventory.updateItemQuantity(2,10);
    inventory.displayInventory();
    System.out.println("\nRemoving Item with ID 1:");
    inventory.removeItemByID(1);
    inventory.displayInventory();
    System.out.println("\nSearching for Item by ID 3:");
    inventory.searchItemByID(3);
    System.out.println("\nSearching for Item by Name 'Item4':");
    inventory.searchItemByName("Item4");
    }
    }
    