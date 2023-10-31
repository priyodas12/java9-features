package io.priyotech.github;

import java.time.LocalDate;
import java.util.stream.Stream;

public class StreamIterateWithPredicate {

    public static void main(String[] args) {
        Stream.iterate(0,n->n+2)
                .limit(20)
                .forEach(System.out::println);

        Stream.iterate(1,n->n*2)
                .takeWhile(n->n<12)
                .forEach(System.out::println);

        Stream.iterate(1, n->n<20, n->n*2)
                .forEach(System.out::println);

        LocalDate today=LocalDate.now();

        Stream.iterate(today,date->date.plusDays(1))
                .limit(7)
                .forEach(System.out::println);
    }
}
