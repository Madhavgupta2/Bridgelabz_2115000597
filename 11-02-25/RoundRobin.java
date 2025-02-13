class Process{
    int processID;
    int burstTime;
    int priority;
    Process next;
    public Process(int processID,int burstTime,int priority){
    this.processID=processID;
    this.burstTime=burstTime;
    this.priority=priority;
    this.next=null;
    }
    }
    class RoundRobinScheduling{
    Process head;
    Process tail;
    public RoundRobinScheduling(){
    head=null;
    tail=null;
    }
    public void addProcess(int processID,int burstTime,int priority){
    Process newProcess=new Process(processID,burstTime,priority);
    if(head==null){
    head=tail=newProcess;
    newProcess.next=head;
    }else{
    tail.next=newProcess;
    tail=newProcess;
    tail.next=head;
    }
    }
    public void removeProcessByID(int processID){
    if(head==null){
    System.out.println("Queue is empty");
    return;
    }
    Process temp=head;
    Process prev=null;
    while(temp!=null){
    if(temp.processID==processID){
    if(prev==null){
    head=temp.next;
    tail.next=head;
    }else{
    prev.next=temp.next;
    if(temp==tail){
    tail=prev;
    }
    }
    System.out.println("Process with ID "+processID+" removed");
    return;
    }
    prev=temp;
    temp=temp.next;
    if(temp==head) break;
    }
    System.out.println("Process with ID "+processID+" not found");
    }
    public void roundRobinScheduling(int timeQuantum){
    if(head==null){
    System.out.println("No processes to schedule");
    return;
    }
    int totalWaitingTime=0;
    int totalTurnaroundTime=0;
    int processCount=0;
    Process temp=head;
    while(true){
    if(temp.burstTime<=timeQuantum){
    totalWaitingTime+=processCount * timeQuantum;
    totalTurnaroundTime+=processCount * timeQuantum;
    processCount++;
    removeProcessByID(temp.processID);
    if(head==null){
    break;
    }
    temp=head;
    }else{
    temp.burstTime-=timeQuantum;
    totalWaitingTime+=processCount * timeQuantum;
    totalTurnaroundTime+=processCount * timeQuantum;
    processCount++;
    temp=temp.next;
    }
    }
    System.out.println("\nAverage Waiting Time: "+(totalWaitingTime/processCount));
    System.out.println("Average Turnaround Time: "+(totalTurnaroundTime/processCount));
    }
    public void displayProcesses(){
    if(head==null){
    System.out.println("Queue is empty");
    return;
    }
    Process temp=head;
    do{
    System.out.println("Process ID: "+temp.processID+", Burst Time: "+temp.burstTime+", Priority: "+temp.priority);
    temp=temp.next;
    }while(temp!=head);
    }
    }
    public class RoundRobinApp{
    public static void main(String[] args){
    RoundRobinScheduling scheduler=new RoundRobinScheduling();
    scheduler.addProcess(1,10,2);
    scheduler.addProcess(2,5,3);
    scheduler.addProcess(3,8,1);
    scheduler.addProcess(4,6,4);
    System.out.println("Processes in the queue:");
    scheduler.displayProcesses();
    System.out.println("\nStarting Round Robin Scheduling with Time Quantum of 4:");
    scheduler.roundRobinScheduling(4);
    }
    }
    