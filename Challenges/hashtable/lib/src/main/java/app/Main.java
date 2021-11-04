package app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.add("Ruaa", 300);
        hashTable.add("Raghad", 400);
        hashTable.add("Khair", 200);
        hashTable.add("Jamal", 100);
        hashTable.add("Doaa", 600);
        hashTable.add("Farah", 700);
        hashTable.add("Mohammad", 90000);
        hashTable.add("Jemi", 800);
        hashTable.add("Naim", 1000);
        hashTable.add("Qusai", 1500);
        hashTable.add("Deyaa", 10000);

        System.out.println("The size is => " + hashTable.getSize());
        System.out.println("The Qusai allowance is => " + hashTable.get("Qusai"));
        System.out.println(hashTable.contains("Qusai"));
        System.out.println(hashTable.getBucketIndex("Qusai"));
        System.out.println(hashTable);


    }
}
