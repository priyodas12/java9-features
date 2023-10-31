package io.priyotech.github;

import java.util.stream.Stream;

public class StreamIterateWithPredicate {

    public static void main(String[] args) {
        Stream.iterate(1,n->n*2)
                .limit(20)
                .forEach(System.out::println);
    }
}
