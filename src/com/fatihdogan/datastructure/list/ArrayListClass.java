package com.fatihdogan.datastructure.list;

import com.fatihdogan.datastructure.ObjectTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {

     public void Test() {
         try {
             // Declaration
             ArrayList<String> list1 = new ArrayList<>();
             List<Integer> list2 = new ArrayList<>();
             List<ObjectTest> list3 = new ArrayList<>();

             //Adding item
             list1.add("Add String value");
             list2.add(55);
             list3.add(new ObjectTest("Name", 451));

             //Getting Item
             String listValue = list1.get(0);
             ObjectTest objectTest = list3.get(0);

             //Insert item
             list1.add(1, "Fatih");
             list1.add(1, "Murat");
             list1.add(0, "Java");

             //FAIL: When try to add to non-existing index
             //list1.add(5, "NewEntry");

             //Set
             list1.set(0, "Java Course");

             //Remove Item
             list1.remove(2);
             list1.remove("Fatih");
             list1.remove(0);

             ListIterator<String> ll = list1.listIterator();
             while(ll.hasNext())
                 System.out.println(ll.next());
             System.out.println("-----------------------------------");
         }
         catch (Exception ex) {
             System.out.println(ex.toString());
         }

    }
}
