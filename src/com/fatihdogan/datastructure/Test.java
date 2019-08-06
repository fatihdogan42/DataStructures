package com.fatihdogan.datastructure;

import java.util.*;

public class Test {
    public void Test(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();
        List<Integer> linkedList = new LinkedList<>();

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> hashtable = new Hashtable<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        for(int i = 0; i<50; i++) {
            arrayList.add(i);
            vector.add(i);
            linkedList.add(i);

            hashSet.add(i);
            treeSet.add(i);
            linkedHashSet.add(i);

            hashMap.put(i, i);
            hashtable.put(i, i);
            linkedHashMap.put(i, i);
        }

        arrayList.get(5);
        linkedList.get(5);
        //linkedList.peek();
        vector.get(5);

        System.out.println(arrayList);
        System.out.println(vector);
        System.out.println(linkedList);

        System.out.println("---------------------------------");
        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);

        System.out.println("---------------------------------");
        System.out.println(hashMap);
        System.out.println(hashtable);
        System.out.println(linkedHashMap);


        System.out.println("---------------------------------");
        ListIterator iterator = arrayList.listIterator();
        Iterator iterator2 = hashSet.iterator();

        while(iterator.hasNext())
            System.out.print(iterator.next() + "-");

        System.out.println("");
        while(iterator2.hasNext())
            System.out.print(iterator2.next() + "-");

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            System.out.println("Anahtar : " + entry.getKey() + " --> Değer: " + entry.getValue());
        }

        int f = 99;

    }

}
