package main;

import lru.LruCache;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int capacity = 100;
        Map<Integer,String> lruCache = new LruCache<>(50);
        List<String> users = new ArrayList<>(capacity);
        Random random = new Random();


        for(int i = 0 ; i < capacity; ++i){
            users.add("User " + i);
        }

        /*
        For more obvious result change maxCapacity in Map to 3 and uncomment this block.

        lruCache.put(1,"1");
        lruCache.put(2,"2");
        lruCache.put(3,"3");
        lruCache.put(4,"3");
         */



        for(int i = 0 ; i < capacity; ++i){
            lruCache.put(i,users.get(random.nextInt(capacity)));
        }

        for(Map.Entry<Integer,String> entry:lruCache.entrySet()){
            System.out.println(entry.getKey() +  "   " + entry.getValue());
        }
    }
}

