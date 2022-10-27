package taskfive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * klass uppgf 5
 */
public class Main {

    /**
     * metod uppgf 5
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();


        Car car1 = new Car("Grå","Volvo");
        Car car2 = new Car("Blå","Saab");
        Car car3 = new Car("Gul","Ford");
        Car car4 = new Car("Grön","Toyota");

        System.out.println(Car.getNumberOfCars());
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        mapper.writeValue(Paths.get("src/main/resources/cars.json").toFile(), cars);
    }
}
