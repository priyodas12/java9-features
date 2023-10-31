package io.priyotech.github;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithLimit {

    public static void main(String[] args) {
        limit();
        skip();
    }

    public static void limit(){
        List<String> data=getData().stream()
                .sorted(Comparator.reverseOrder())
                .limit(4) //take first 4 elements
                .collect(Collectors.toList());
        System.out.println(data);
    }

    public static void skip(){
        List<String> data=getData().stream()
                .sorted(Comparator.reverseOrder())
                .skip(4) //skip the first 4 element
                .collect(Collectors.toList());
        System.out.println(data);
    }

    public static List<String> getData(){
        return List.of("a","b","c","x","y","m","k","d");
    }
}
