package com.company;

//import java.util.HashMap;
//import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /*        System.out.println("TEST");

            Map<Integer, String> myMap = new HashMap<>();

            myMap.put(0, "New York");
            myMap.put(1, "Washington DC");
            myMap.put(2, "Los Angeles");
            myMap.put(3, "Boston");

            for(Map.Entry<Integer, String> entry: myMap.entrySet()){
                System.out.println("City Number: " + entry.getKey());
                System.out.println("City Name: " + entry.getValue());
                System.out.println("____________________");
            }*/

        LinkedList list = new LinkedList();

        list.insert(48);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(25);
        list.display();

        list.insertAt(0,55);
        list.display();

        list.deleteAt(1);
        list.display();
    }
}
