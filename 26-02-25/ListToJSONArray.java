import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class ListToJSONArray {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        
        List<Car> cars = Arrays.asList(new Car("Tesla", "Model S", 2021), new Car("BMW", "X5", 2020));
        
        String jsonArray = objectMapper.writeValueAsString(cars);
        System.out.println(jsonArray);
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
