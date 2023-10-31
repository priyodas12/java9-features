package io.priyotech.github;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCompare {

    public static void main(String[] args) {
        List<ProductStock> sortByValue= ProductStock.getStocks()
                .stream()
                .peek(ps-> System.out.println("Before sorting:: "+ps))
                .sorted(Comparator.comparing(ProductStock::getValue))
                .peek(ps-> System.out.println("After sorting:: "+ps))
                .collect(Collectors.toList());

        System.out.println(sortByValue);
    }
}
