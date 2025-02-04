public class Patient {
    private static String hospitalName;
    private static int totalPatients;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = generatePatientID();
        totalPatients++;
    }

    private String generatePatientID() {
        return "P" + (1000 + totalPatients);
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public static void setHospitalName(String hospitalName) {
        Patient.hospitalName = hospitalName;
    }

    public static String getHospitalName() {
        return hospitalName;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("This is not a valid Patient object.");
        }
    }
}

