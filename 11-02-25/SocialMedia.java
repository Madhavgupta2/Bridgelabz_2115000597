class User{
    int userID;
    String name;
    int age;
    User next;
    FriendNode friendListHead;
    public User(int userID,String name,int age){
    this.userID=userID;
    this.name=name;
    this.age=age;
    this.next=null;
    this.friendListHead=null;
    }
    }
    class FriendNode{
    int friendID;
    FriendNode next;
    public FriendNode(int friendID){
    this.friendID=friendID;
    this.next=null;
    }
    }
    class SocialMediaSystem{
    User head;
    public SocialMediaSystem(){
    head=null;
    }
    public void addUser(int userID,String name,int age){
    User newUser=new User(userID,name,age);
    newUser.next=head;
    head=newUser;
    }
    public User findUserByID(int userID){
    User temp=head;
    while(temp!=null){
    if(temp.userID==userID){
    return temp;
    }
    temp=temp.next;
    }
    return null;
    }
    public User findUserByName(String name){
    User temp=head;
    while(temp!=null){
    if(temp.name.equals(name)){
    return temp;
    }
    temp=temp.next;
    }
    return null;
    }
    public void addFriendConnection(int userID1,int userID2){
    User user1=findUserByID(userID1);
    User user2=findUserByID(userID2);
    if(user1==null||user2==null){
    System.out.println("One or both users not found");
    return;
    }
    addFriend(user1,userID2);
    addFriend(user2,userID1);
    System.out.println("Friend connection added between User ID "+userID1+" and User ID "+userID2);
    }
    private void addFriend(User user,int friendID){
    FriendNode newFriend=new FriendNode(friendID);
    newFriend.next=user.friendListHead;
    user.friendListHead=newFriend;
    }
    public void removeFriendConnection(int userID1,int userID2){
    User user1=findUserByID(userID1);
    User user2=findUserByID(userID2);
    if(user1==null||user2==null){
    System.out.println("One or both users not found");
    return;
    }
    removeFriend(user1, userID2);
    removeFriend(user2, userID1);
    System.out.println("Friend connection removed between User ID "+userID1+" and User ID "+userID2);
    }
    private void removeFriend(User user,int friendID){
    FriendNode temp=user.friendListHead;
    FriendNode prev=null;
    while(temp!=null){
    if(temp.friendID==friendID){
    if(prev==null){
    user.friendListHead=temp.next;
    }else{
    prev.next=temp.next;
    }
    return;
    }
    prev=temp;
    temp=temp.next;
    }
    }
    public void findMutualFriends(int userID1,int userID2){
    User user1=findUserByID(userID1);
    User user2=findUserByID(userID2);
    if(user1==null||user2==null){
    System.out.println("One or both users not found");
    return;
    }
    System.out.print("Mutual friends between User ID "+userID1+" and User ID "+userID2+": ");
    FriendNode temp1=user1.friendListHead;
    while(temp1!=null){
    FriendNode temp2=user2.friendListHead;
    while(temp2!=null){
    if(temp1.friendID==temp2.friendID){
    System.out.print(temp1.friendID+" ");
    }
    temp2=temp2.next;
    }
    temp1=temp1.next;
    }
    System.out.println();
    }
    public void displayAllFriends(int userID){
    User user=findUserByID(userID);
    if(user==null){
    System.out.println("User not found");
    return;
    }
    System.out.print("Friends of User ID "+userID+": ");
    FriendNode temp=user.friendListHead;
    while(temp!=null){
    System.out.print(temp.friendID+" ");
    temp=temp.next;
    }
    System.out.println();
    }
    public void countNumberOfFriends(int userID){
    User user=findUserByID(userID);
    if(user==null){
    System.out.println("User not found");
    return;
    }
    int count=0;
    FriendNode temp=user.friendListHead;
    while(temp!=null){
    count++;
    temp=temp.next;
    }
    System.out.println("User ID "+userID+" has "+count+" friends");
    }
    }
    public class SocialMediaApp{
    public static void main(String[] args){
    SocialMediaSystem system=new SocialMediaSystem();
    system.addUser(1,"Alice",25);
    system.addUser(2,"Bob",30);
    system.addUser(3,"Charlie",22);
    system.addUser(4,"David",28);
    system.addFriendConnection(1,2);
    system.addFriendConnection(1,3);
    system.addFriendConnection(2,3);
    system.addFriendConnection(3,4);
    system.displayAllFriends(1);
    system.displayAllFriends(2);
    system.displayAllFriends(3);
    system.findMutualFriends(1,2);
    system.countNumberOfFriends(1);
    system.countNumberOfFriends(2);
    system.removeFriendConnection(1,2);
    system.displayAllFriends(1);
    system.displayAllFriends(2);
    }
    }
    