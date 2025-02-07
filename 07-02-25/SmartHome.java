class Device{
    String deviceId,status;
    Device(String deviceId,String status){
        this.deviceId=deviceId;this.status=status;
    }
    void displayStatus(){
        System.out.println("Device ID: "+deviceId+", Status: "+status);
    }
}
class Thermostat extends Device{
    int temperatureSetting;
    Thermostat(String deviceId,String status,int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: "+temperatureSetting+"°C");
    }
}
public class SmartHome{
    public static void main(String[] args){
        Thermostat t=new Thermostat("T1001","On",22);
        t.displayStatus();
    }
}
