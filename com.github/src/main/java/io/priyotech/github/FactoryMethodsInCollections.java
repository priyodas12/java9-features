package io.priyotech.github;

import java.util.*;

public class FactoryMethodsInCollections {

    public static void unModifiableListWithAdd(){
        List<String> strList=new ArrayList<>();
        strList.add("abc");
        strList.add("bca");
        strList.add("cab");

        List<String> stringList= Collections.unmodifiableList(strList);
        //stringList.add("dab"); //immutable list
        System.out.printf(String.format("unmodifiable list is %s \n",stringList));

    }

    public static void unModifiableListAsList(){
        List<String> strList=Collections.unmodifiableList(Arrays.asList("abc","bca","cab"));
        //strList.add("dab"); //immutable list
        System.out.printf(String.format("unmodifiable list is %s \n",strList));

    }

    public static void main(String[] args) {

        unModifiableListWithAdd();

        unModifiableListAsList();
        //List.of()->static factory method.
        /**duplicate elements and null values are not allowed*/
        List<String> immutableList = List.of("dav", "ogyh", "uan");
        List<String> immutableList2 = List.of("g", "a", "z", "u", "q", "i", "l", "b", "j", "c");
        List<String> immutableList3 = List.of("g", "a", "z", "u", "q", "i", "l", "b", "j", "c", "d");

        /**duplicate elements and null values are not allowed*/
        Set<String> immutableSet = Set.of("a", "k", "z", "u", "v", "i", "w", "b", "j", "s");
        Map<String, Integer> immutableMap =
                Map.ofEntries(
                        Map.entry("a", 100),
                        Map.entry("b", 200),
                        Map.entry("c", 300)
                );
        try {
            immutableList.add("igs");
            immutableList3.add("x");
        }catch (UnsupportedOperationException e){
            System.out.println("Cannot add element due to:  "+e);
        }
        System.out.println(immutableList);
        System.out.println(immutableList3);
        System.out.println(immutableSet);
        System.out.println(immutableMap);
    }
}
