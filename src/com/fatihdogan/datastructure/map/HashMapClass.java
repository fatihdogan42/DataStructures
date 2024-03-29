package com.fatihdogan.datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
     /*
    HashMap Sınıfı
    1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık gelen bir tane değer bulunur.
    2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
    3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
    */

    public  void Test() {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        //Map<Integer,String> hashMap = new HashMap<Integer,String>();

        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20, "Math");
        hashMap.put(20, "Php");
        hashMap.put(50, "Javascript");


        System.out.println(hashMap);

        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(20));
        System.out.println(hashMap.get(100)); // Hata vermez, null döner

        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
            System.out.println("Anahtar : " + entry.getKey() + " ------> Değer: " + entry.getValue());
        }
    }
}
