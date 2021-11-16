package pl.coderslab.homeworks.jsp;

import java.util.HashMap;
import java.util.Map;

public class s {

    public static void main(String[] args) {
        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Hallo");
        lang.put("es", "Hola");
        lang.put("fr", "Salut");


        System.out.println(lang.get("en"));
    }
}
