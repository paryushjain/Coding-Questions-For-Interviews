package com.coding.questions.interviews.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String >>map=new HashMap<>();
        for(String str: strs){
            char ca[] = new char[26];
            for(char c: str.toCharArray()){
                ca[c-'a']++;
                System.out.println(c-'a');
            }
            String keyStr = String.valueOf(ca);
            System.out.println(keyStr);
            if(!map.containsKey(keyStr)) map.put(keyStr,new ArrayList<>());
            map.get(keyStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
