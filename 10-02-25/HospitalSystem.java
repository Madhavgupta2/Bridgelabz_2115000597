abstract class Patient{
    private String patientId;
    private String name;
    private int age;
    public abstract double calculateBill();
    public void getPatientDetails(){
        System.out.println("Patient ID: "+patientId+" Name: "+name+" Age: "+age);
    }
    public String getPatientId(){
        return patientId;
    }
    public void setPatientId(String patientId){
        this.patientId=patientId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

class InPatient extends Patient{
    private int daysAdmitted;
    private double dailyRate;
    public double calculateBill(){
        return daysAdmitted * dailyRate;
    }
    public void setDaysAdmitted(int daysAdmitted){
        this.daysAdmitted=daysAdmitted;
    }
    public void setDailyRate(double dailyRate){
        this.dailyRate=dailyRate;
    }
}

class OutPatient extends Patient{
    private double consultationFee;
    public double calculateBill(){
        return consultationFee;
    }
    public void setConsultationFee(double consultationFee){
        this.consultationFee=consultationFee;
    }
}

interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}

class InPatientRecord implements MedicalRecord{
    private String records="";
    public void addRecord(String record){
        records+=record+"\n";
    }
    public void viewRecords(){
        System.out.println("In-Patient Medical Records: \n"+records);
    }
}

class OutPatientRecord implements MedicalRecord{
    private String records="";
    public void addRecord(String record){
        records+=record+"\n";
    }
    public void viewRecords(){
        System.out.println("Out-Patient Medical Records: \n"+records);
    }
}

public class HospitalSystem{
    public static void main(String[] args){
        Patient patient1=new InPatient();
        patient1.setPatientId("IP123");
        patient1.setName("John");
        patient1.setAge(35);
        InPatient inPatient=(InPatient)patient1;
        inPatient.setDaysAdmitted(5);
        inPatient.setDailyRate(1000);
        
        Patient patient2=new OutPatient();
        patient2.setPatientId("OP456");
        patient2.setName("Alice");
        patient2.setAge(28);
        OutPatient outPatient=(OutPatient)patient2;
        outPatient.setConsultationFee(500);
        
        MedicalRecord inPatientRecord=new InPatientRecord();
        MedicalRecord outPatientRecord=new OutPatientRecord();
        
        patient1.getPatientDetails();
        System.out.println("In-Patient Bill: "+inPatient.calculateBill());
        inPatientRecord.addRecord("Diagnosis: Flu");
        inPatientRecord.viewRecords();
        
        patient2.getPatientDetails();
        System.out.println("Out-Patient Bill: "+outPatient.calculateBill());
        outPatientRecord.addRecord("Diagnosis: Cold");
        outPatientRecord.viewRecords();
    }
}
