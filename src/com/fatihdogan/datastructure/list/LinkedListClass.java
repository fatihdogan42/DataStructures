package com.fatihdogan.datastructure.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

    //The node can reside any where in the memory and linked together to make a list.
    //This achieves optimized utilization of space.
    //Disadvantage: Nodes cannot be accessed directly instead we need to start from the head and follow through the link
    public void Test()
    {
        LinkedList<String> placesToGo1 = new LinkedList<>();
        LinkedList<String> placesToGoSirali = new LinkedList<>();

        //Add
        placesToGo1.add("Postane");
        placesToGo1.add("Market");
        placesToGo1.add("Ev");
        placesToGo1.add("Sanayi");
        placesToGo1.add("Ayakkabici");
        placesToGo1.add("Kütüphane");
        yazdiz(placesToGo1);

        //Add
        alfabetikSiraliEkle(placesToGoSirali,"Postane");
        alfabetikSiraliEkle(placesToGoSirali,"Market");
        alfabetikSiraliEkle(placesToGoSirali,"Ev");
        alfabetikSiraliEkle(placesToGoSirali,"Sanayi");
        alfabetikSiraliEkle(placesToGoSirali,"Ayakkabici");
        alfabetikSiraliEkle(placesToGoSirali,"Kütüphane");
        yazdiz(placesToGoSirali);
    }

    private static void alfabetikSiraliEkle(LinkedList<String> placesToGo, String yeni){
        ListIterator<String> iterator = placesToGo.listIterator();

        while (iterator.hasNext()) {

            int compareValue = iterator.next().compareTo(yeni);

            if (compareValue == 0) {
                // İki değer eşit
                System.out.println("Listeniz bu eleman zaten var....");
                return;
            }
            else if (compareValue  < 0) {
                // Yeni değer iterator.next ten daha büyük.
            }
            else if (compareValue > 0 ) {
                // Yeni değer iterator.next ten daha küçük.
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }

    void yazdiz(LinkedList<String> list)
    {
        System.out.println("**************************************************");
        for(String s:list)
            System.out.println(s);

        System.out.println("**************************************************");
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
