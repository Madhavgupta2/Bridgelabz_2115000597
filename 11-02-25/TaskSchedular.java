class Task{
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Task next;
    public Task(int taskID,String taskName,int priority,String dueDate){
    this.taskID=taskID;
    this.taskName=taskName;
    this.priority=priority;
    this.dueDate=dueDate;
    this.next=null;
    }
    }
    class TaskScheduler{
    Task head;
    public TaskScheduler(){
    head=null;
    }
    public void addTaskAtBeginning(int taskID,String taskName,int priority,String dueDate){
    Task newTask=new Task(taskID,taskName,priority,dueDate);
    if(head==null){
    head=newTask;
    newTask.next=head;
    }else{
    newTask.next=head;
    Task temp=head;
    while(temp.next!=head){
    temp=temp.next;
    }
    temp.next=newTask;
    head=newTask;
    }
    }
    public void addTaskAtEnd(int taskID,String taskName,int priority,String dueDate){
    Task newTask=new Task(taskID,taskName,priority,dueDate);
    if(head==null){
    head=newTask;
    newTask.next=head;
    }else{
    Task temp=head;
    while(temp.next!=head){
    temp=temp.next;
    }
    temp.next=newTask;
    newTask.next=head;
    }
    }
    public void addTaskAtPosition(int taskID,String taskName,int priority,String dueDate,int position){
    Task newTask=new Task(taskID,taskName,priority,dueDate);
    if(position==0){
    addTaskAtBeginning(taskID,taskName,priority,dueDate);
    return;
    }
    Task temp=head;
    for(int i=0;i<position-1;i++){
    if(temp.next==head){
    System.out.println("Position out of range");
    return;
    }
    temp=temp.next;
    }
    newTask.next=temp.next;
    temp.next=newTask;
    }
    public void removeTaskByID(int taskID){
    if(head==null){
    System.out.println("List is empty");
    return;
    }
    Task temp=head;
    Task prev=null;
    while(temp.next!=head){
    if(temp.taskID==taskID){
    if(prev==null){
    Task last=head;
    while(last.next!=head){
    last=last.next;
    }
    head=temp.next;
    last.next=head;
    return;
    }else{
    prev.next=temp.next;
    return;
    }
    }
    prev=temp;
    temp=temp.next;
    }
    if(temp.taskID==taskID){
    if(prev==null){
    head=null;
    }else{
    prev.next=head;
    }
    }
    }
    public void viewCurrentTaskAndMoveNext(){
    if(head==null){
    System.out.println("List is empty");
    return;
    }
    Task temp=head;
    System.out.println("Current Task: ID: "+temp.taskID+", Name: "+temp.taskName+", Priority: "+temp.priority+", Due Date: "+temp.dueDate);
    head=temp.next;
    }
    public void displayAllTasks(){
    if(head==null){
    System.out.println("List is empty");
    return;
    }
    Task temp=head;
    do{
    System.out.println("Task ID: "+temp.taskID+", Task Name: "+temp.taskName+", Priority: "+temp.priority+", Due Date: "+temp.dueDate);
    temp=temp.next;
    }while(temp!=head);
    }
    public void searchTaskByPriority(int priority){
    if(head==null){
    System.out.println("List is empty");
    return;
    }
    Task temp=head;
    boolean found=false;
    do{
    if(temp.priority==priority){
    System.out.println("Task Found: ID: "+temp.taskID+", Name: "+temp.taskName+", Priority: "+temp.priority+", Due Date: "+temp.dueDate);
    found=true;
    }
    temp=temp.next;
    }while(temp!=head);
    if(!found){
    System.out.println("No task found with Priority: "+priority);
    }
    }
    }
    public class TaskSchedulerApp{
    public static void main(String[] args){
    TaskScheduler scheduler=new TaskScheduler();
    scheduler.addTaskAtEnd(1,"Task1",3,"2025-03-01");
    scheduler.addTaskAtEnd(2,"Task2",1,"2025-02-20");
    scheduler.addTaskAtBeginning(3,"Task3",2,"2025-02-18");
    scheduler.addTaskAtPosition(4,"Task4",1,"2025-03-10",2);
    System.out.println("All Tasks:");
    scheduler.displayAllTasks();
    System.out.println("\nView current task and move to next:");
    scheduler.viewCurrentTaskAndMoveNext();
    System.out.println("\nAll Tasks after moving current:");
    scheduler.displayAllTasks();
    System.out.println("\nSearch tasks by Priority 1:");
    scheduler.searchTaskByPriority(1);
    System.out.println("\nRemoving Task with ID 2:");
    scheduler.removeTaskByID(2);
    System.out.println("\nAll Tasks after removal:");
    scheduler.displayAllTasks();
    }
    }
    