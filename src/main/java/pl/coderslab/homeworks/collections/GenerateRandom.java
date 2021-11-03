package pl.coderslab.homeworks.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

    public static Map<Integer, Integer> checkRand(int amount, int interval){
        Map<Integer, Integer> map = new HashMap<>();
        Random random= new Random();

        for(int i =0; i<interval;i++){

            map.put(i,random.nextInt(amount));
        }

        return map;
    }
}
