package io.priyotech.github;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDropWhile {
    /** Ideal case for this operation is while stream items are sorted.*/

    public static void main(String[] args) {
        List<BigDecimal> stockGT10000L= ProductStock.getStocks()
                .stream()
                .sorted(Comparator.comparing(ProductStock::getValue))
                .peek(ps-> System.out.println("Before DropWhile processing:: "+ps.getValue()))
                .dropWhile(ps->ps.getValue().compareTo(BigDecimal.valueOf(10000))<=0) //the moment this inside predicate returns false it will cut-off from pipeline
                .peek(ps-> System.out.println("After DropWhile processing:: "+ps.getValue()))
                .map(ProductStock::getValue)
                .collect(Collectors.toList());

        System.out.println(stockGT10000L);
    }
}
