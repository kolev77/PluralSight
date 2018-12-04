package _5_wildcards.bounded;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Partner donDraper = new Partner("Don Draper", 82);
        Partner bertCooper = new Partner("Bert Cooper", 100);
        Employee peggyOlson = new Employee("Peggy Olson", 64);

        File file = new File("rw");
        PersonSaver personSaver = new PersonSaver(file);
        PersonLoader personLoader = new PersonLoader(file);


        personSaver.save(donDraper);
        personSaver.save(peggyOlson);

        List<Person> allPeople = new ArrayList<>();
        personLoader.loadAll(allPeople);

        Person asd= personLoader.load();
        Person asd2= personLoader.load();
        System.out.println(asd);
        System.out.println(asd2);
        allPeople.forEach(p-> System.out.println(p));

    }
}
