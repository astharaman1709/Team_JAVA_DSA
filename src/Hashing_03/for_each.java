package Hashing_03;

import java.util.*;
public class for_each {
    public static void main(String[] args) {
//        int arr[] = {17, 7, 77, 27};
//        for (int val : arr) {
//            System.out.print(val + " ");
//        }
//        System.out.println(); // To add a line break after array printing

        HashMap<String, Integer> map = new HashMap<>();

        map.put("INDIA", 120);
        map.put("USA", 254);
        map.put("China", 147);
        map.put("Paris", 777);


        //through entry set
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //through key set
        Set<String>Keys= map.keySet();
        for (String key : Keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("China");//remove both key and value
        System.out.println(map);
    }
}