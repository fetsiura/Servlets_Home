package pl.coderslab.homeworks.collections;

import java.util.Map;

public class Main01 {

    public static void main(String[] args) {


        Map<Integer, Integer> map = GenerateRandom.checkRand(500000, 10);

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }
    }

}
