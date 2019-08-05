package com.fatihdogan.datastructure.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareArrayListNikedList {

    public void Test() {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        addValueWithIndex("LinkedList", linkedList);
        addValueWithIndex("ArrayList", arrayList);
        System.out.println("**************************************************");

        addValueWithoutIndex("LinkedList", linkedList);
        addValueWithoutIndex("ArrayList", arrayList);
        System.out.println("**************************************************");

        getValue("LinkedList", linkedList);
        getValue("ArrayList", arrayList);
        System.out.println("**************************************************");

        removeValue("LinkedList", linkedList);
        removeValue("ArrayList", arrayList);
    }

    private void addValueWithIndex(String dataType, List<Integer> list) {

        // Listin sonuna değer ekleme
        long startTime = System.currentTimeMillis();

        for (int i = 0 ; i< 100000 ; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(dataType + " indexli ekleme süresi " + (endTime - startTime) + " ms");
    }

    private void addValueWithoutIndex(String dataType, List<Integer> list) {

        // Liste değer ekleme
        long startTime = System.currentTimeMillis();

        for (int i = 0 ; i< 100000 ; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(dataType + " ekleme süresi " + (endTime - startTime) + " ms");
    }

    private void getValue(String dataType, List<Integer> list) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(dataType + " veri erişme süresi " + (endTime - startTime) + " ms");
    }

    private void removeValue(String veri_tipi, List<Integer> list) {

        long startTime = System.currentTimeMillis();

        for (int i = list.size() -1; i>= 0;  i--) {
            list.remove(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(veri_tipi + " veri silme süresi " + (endTime - startTime) + " ms");
    }
}
