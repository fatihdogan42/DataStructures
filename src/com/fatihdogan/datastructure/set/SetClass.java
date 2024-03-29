package com.fatihdogan.datastructure.set;

import java.util.*;

public class SetClass {

    public void Test()
    {
        Set<String> setHash = new HashSet<>();
        Set<String> setLinked= new LinkedHashSet<>();
        Set<String> setTree = new TreeSet<>();

        // HashSet
        setHash.add("Java");
        setHash.add("Python");
        setHash.add("C++");
        setHash.add("Javascript");
        setHash.add("Php");

        // LinkedHashSet
        setLinked.add("Java");
        setLinked.add("Python");
        setLinked.add("C++");
        setLinked.add("Math");
        setLinked.add("Php");

        // TreeSet
        setTree.add("Java");
        setTree.add("Python");
        setTree.add("C++");
        setTree.add("Javascript");
        setTree.add("Php");
        setTree.add("Php");


        Iterator<String> classes = setHash.iterator();
        System.out.println("**** below print using iterator*****");
        while (classes.hasNext()) {
            System.out.println(classes.next());
        }

        System.out.println("HashSet *******************************");
        for (String s: setHash){
            System.out.println(s);

        }
        System.out.println("LinkedHashSet *************************");
        for (String s: setLinked){
            System.out.println(s);
        }

        System.out.println("TreeSet *******************************");
        for (String s: setTree){
            System.out.println(s);
        }

        System.out.println("*** Contains ****");
        System.out.println(setHash.contains("Go"));
        System.out.println(setLinked.contains("Java"));
        System.out.println(setTree.contains("Java"));

        System.out.println("*** Empty *******");
        System.out.println(setHash.isEmpty());

        setHash.remove("Java");
        for (String s: setHash){
            System.out.println(s);
        }

        System.out.println("*** Fark ********");
        //casting LinkSet to HasSet
        Set<String> convertedSet = new HashSet<>(setLinked);

        //Remove HashSet from LinkSet
        System.out.println(convertedSet.removeAll(setHash));
        System.out.println(convertedSet);

        System.out.println("*** Kesisim *****");

        //

        Set<String> convertedSet2 = new HashSet<>(setLinked);
        System.out.println(convertedSet2.retainAll(setHash));
        System.out.println(convertedSet2);
    }
}
