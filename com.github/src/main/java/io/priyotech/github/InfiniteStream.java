package io.priyotech.github;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        Stream.iterate(0,n->n+2).peek(System.out::println).limit(30).collect(Collectors.toList());
    }
}
