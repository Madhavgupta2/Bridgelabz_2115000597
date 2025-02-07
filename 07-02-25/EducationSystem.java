class Course{
    String courseName;int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;this.duration=duration;
    }
    void displayInfo(){
        System.out.println("Course: "+courseName+", Duration: "+duration+" weeks");
    }
}
class OnlineCourse extends Course{
    String platform;boolean isRecorded;
    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;this.isRecorded=isRecorded;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Platform: "+platform+", Recorded: "+(isRecorded?"Yes":"No"));
    }
}
class PaidOnlineCourse extends OnlineCourse{
    double fee,discount;
    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,double discount){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;this.discount=discount;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Fee: $"+fee+", Discount: "+discount+"%");
    }
}
public class EducationSystem{
    public static void main(String[] args){
        Course c=new Course("Mathematics",10);
        OnlineCourse o=new OnlineCourse("Java Programming",12,"Udemy",true);
        PaidOnlineCourse p=new PaidOnlineCourse("Data Science",16,"Coursera",true,499.99,20);
        c.displayInfo();
        o.displayInfo();
        p.displayInfo();
    }
}
