import java.util.*;

public class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    
    Patient(String name) {
        this.name = name;
    }
    
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    void displayDoctors() {
        System.out.println(name + " has consulted with:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.name);
        }
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();
    
    Doctor(String name) {
        this.name = name;
    }
    
    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " is consulting with " + patient.name);
    }
    
    void displayPatients() {
        System.out.println("Dr. " + name + " has consulted with:");
        for (Patient patient : patients) {
            System.out.println(patient.name);
        }
    }
}

class Hospital {
    String hospitalName;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    
    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    void addPatient(Patient patient) {
        patients.add(patient);
    }
    
    void displayHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.name);
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        
        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
        
        doctor1.displayPatients();
        doctor2.displayPatients();
        
        patient1.displayDoctors();
        patient2.displayDoctors();
        
        hospital.displayHospitalInfo();
    }
}
