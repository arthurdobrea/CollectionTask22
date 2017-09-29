package main;

import lru.LruCache;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int capacity = 100;
        Map<Integer,Integer> lruCache = new LruCache<>(3);
        List<String> users = new ArrayList<>(capacity);



        for(int i = 0 ; i < capacity; ++i){
            users.add("User " + i);
        }


        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        lruCache.put(4,4);
        lruCache.put(1,1);


        for(Map.Entry<Integer,Integer> entry:lruCache.entrySet()){
            System.out.println(entry.getKey() +  "   " + entry.getValue());
        }
        }
    }

