package com.fatihdogan.datastructure;

import com.fatihdogan.datastructure.list.ArrayListClass;
import com.fatihdogan.datastructure.list.CompareArrayListNikedList;
import com.fatihdogan.datastructure.list.LinkedListClass;
import com.fatihdogan.datastructure.map.HashMapClass;
import com.fatihdogan.datastructure.map.MapClass;
import com.fatihdogan.datastructure.set.SetClass;

public class Main {
    public static void main(String[] args) {

        ArrayListClass arrayList = new ArrayListClass();
      //  arrayList.Test();

        LinkedListClass linkedList = new LinkedListClass();
       //linkedList.Test();

        CompareArrayListNikedList compare = new CompareArrayListNikedList();
     //   compare.Test();

        SetClass setClass = new SetClass();
//        setClass.Test();

        HashMapClass hash = new HashMapClass();
     //   hash.Test();

        MapClass map = new MapClass();
      // map.Test();

        Test tt = new Test();
        tt.Test();

    }
}
