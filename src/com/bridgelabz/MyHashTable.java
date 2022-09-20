package com.bridgelabz;
public class MyHashTable {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String[] words = sentence.toLowerCase().split(" ");

        MyHashMap<String, Integer> MyHashMap = new MyHashMap<>();

        for (String word : words) {
            Integer value = MyHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            MyHashMap.add(word, value);
        }

        int frequency = (int) MyHashMap.get("to");

        System.out.println(MyHashMap);
    }
}
