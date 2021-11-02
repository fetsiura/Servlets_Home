package pl.coderslab.homeworks.collections;

import java.util.regex.Pattern;

public class Main03 {

    public static void main(String[] args) {
        System.out.println(verifyLogin("glinux"));
        System.out.println(verifyLogin("5ere"));
        System.out.println(verifyLogin("5linux"));
    }

    static boolean verifyLogin(String login){
        String reg = "^[a-z][a-z0-9_-]{5,}";

        return Pattern.matches(reg,login);
    }
}
