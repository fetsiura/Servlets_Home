package pl.coderslab.homeworks.collections;

import java.util.regex.Pattern;

public class Main02 {

    String reg1 = "[1-9][0-9]*\\.+[0-9][0-9]*";
    String reg2 = "-?\\d*\\.?\\d+e[+-]?\\d+";
    String reg3 = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
    String reg4 = "";

    public static void main(String[] args) {


        String aa = "1";
        String aaa = "22";
        String aaa2 = "222";
        int s=1;
        int ss=12;
        int sss=133;

        String onlyNumbers = "[0-9]{1,2}";


        System.out.println(Pattern.matches(onlyNumbers,aa));
        System.out.println(Pattern.matches(onlyNumbers,aaa));
        System.out.println(Pattern.matches(onlyNumbers,aaa2));
    }
}
