import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        
        Car car = new Car("Tesla", "Model S", 2021);
        String carJson = objectMapper.writeValueAsString(car);
        System.out.println(carJson);
    }

    static class Car {
        public String brand;
        public String model;
        public int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
    }
}
