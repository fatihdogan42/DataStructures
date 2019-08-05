package com.fatihdogan.datastructure.map;

import java.util.*;

public class MapClass {

    public  void Test() {
        Map<Integer,String> hashmap = new HashMap<>();
        Map<Integer,String> linkedhashmap = new LinkedHashMap<>();
        Map<Integer,String> treemap = new TreeMap<>();

        System.out.println("******************");
        mapFillPrint(hashmap);

        System.out.println("******************");
        mapFillPrint(linkedhashmap);

        System.out.println("******************");
        mapFillPrint(treemap);
    }

     private void mapFillPrint(Map<Integer,String> map) {
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        System.out.println("Method1--------------> EntrySet");
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("Method2--------------> KeySet");
        System.out.println(map.keySet());

        System.out.println("Method3--------------> KeySet/ get");
        for (Integer key : map.keySet()){
            System.out.println("Key : " + key + " Value: " + map.get(key));
        }

        System.out.println("Method4--------------> Collection");
        Collection<String> values = map.values();
        for (String s: values) {
            System.out.println("Değer : " + s);
        }
    }


}
