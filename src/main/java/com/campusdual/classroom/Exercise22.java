package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> myList = new ArrayList<>();
        myList.add("GKFFD");
        myList.add("TNANA");
        myList.add("MPMSL");
        myList.add("PSWME");
        myList.add("LZMLF");
        myList.add("JYEBV");
        myList.add("YELNT");
        myList.add("JSNKR");
        myList.add("JFESF");
        myList.add("TMJLL");
        return myList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Element at index " + i + " is: " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();
        String newElement = "AAAAA";
        System.out.println((addElementToList(myList, newElement)) ? "Element " + newElement + " added successfully" : "Element " + newElement + " couldn't be added.");
        printElementsAndIndex(myList);
    }


}
