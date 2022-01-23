package com.coding.questions.interviews.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapExample {
    private static List<Integer> list;
    public static void main(String[] args) {
        list = Arrays.asList(0,50,30,40,10,5,20,30);
        list = new ArrayList<>(list);
        list = insertElementInHeap(list,60);
        list.forEach(System.out::println);
    }

    private static List<Integer> insertElementInHeap(List<Integer> list, Integer ele){
        list.add(ele);
        int size = list.size();
        int parent = size/2;
        while(list.get(parent)<ele){
            list.set(parent,ele);
            list.set(size-1,list.get(parent));
            parent/=2;
        }
        return list;
    }


}
