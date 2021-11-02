package pl.coderslab.homeworks.collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class Main04 {

    public static void main(String[] args) {

        List<Person > persons = new ArrayList<>();
        Path path = Paths.get("people.csv");

        String emailRegex = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
        String onlyLetters = "^[a-zA-Z]+$";
        String onlyNumbers = "^[0-9]+$";
        try{
            for (String line : Files.readAllLines(path)){
                List<String> data = Arrays.asList(line.split(","));
                if(data.size() == 5 &&
                        data.get(0).matches(emailRegex) &&
                        data.get(1).matches(onlyLetters) &&
                        data.get(2).matches(onlyLetters) &&
                        data.get(3).matches(onlyNumbers) &&
                        data.get(4).matches(onlyLetters)){
                    Person person = new Person();
                    person.setName(data.get(1));
                    person.setSurname(data.get(2));
                    person.setAge(Integer.parseInt(data.get(3)));
                    person.setCity(data.get(4));
                    persons.add(person);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(persons.size());

        Map<Integer, List<Person>> peopleByAge = new HashMap<>();

        for (Person person : persons){
            if (peopleByAge.containsKey(person.getAge())) {
                peopleByAge.get(person.getAge()).add(person);
            } else {
                List<Person>tmpList = new ArrayList<>();
                tmpList.add(person);
                peopleByAge.put(person.getAge(), tmpList);
            }
        }

        for (Map.Entry<Integer, List<Person>> entry : peopleByAge.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().size());
        }

    }

}
