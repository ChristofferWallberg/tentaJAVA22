package taskfour;

import com.fasterxml.jackson.databind.ObjectMapper;
import taskthree.Person;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * klass uppgf 4
 */
public class Main {
    /**
     * metod uppgf 4
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Path path = Paths.get("src/main/resources/people.json");

        List<Person> people = new ArrayList<>((List.of(mapper.readValue(path.toFile(), Person[].class))));
//        people.addAll(List.of(mapper.readValue(path.toFile(), Person[].class)));

        System.out.println(people);

        people = taskthree.Person.createPerson();

        mapper.writeValue(path.toFile(), people);




    }
}
