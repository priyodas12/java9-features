package io.priyotech.github;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEnhancementOne {
    public static void main(String[] args) {
        List<Stock> allStocks=StockUtils.getAllStocks();

        List<Stock> sortedStocks = allStocks
                .stream()
                .sorted(Comparator.comparing(Stock::getPriceInBn))
                .toList();

        List<String> stock50L = sortedStocks.stream()
                .peek(stock -> System.out.println(stock.getName()))
                .takeWhile(TakeWhileDrop::isStockLessThan50L)
                .map(Stock::getName)
                .collect(Collectors.toList());

        System.out.println(stock50L);
    }
}


class Stock{
    String name;
    Long priceInBn;

    public Stock(String name, Long priceInBn) {
        this.name = name;
        this.priceInBn = priceInBn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPriceInBn() {
        return priceInBn;
    }

    public void setPriceInBn(Long priceInBn) {
        this.priceInBn = priceInBn;
    }
}

class TakeWhileDrop{
    public static boolean isStockLessThan50L(Stock stock){
        return stock.getPriceInBn()<50L;
    }
}

class StockUtils{
    public static List<Stock> getAllStocks() {
        return List.of(new Stock("Google", 137L),
                new Stock("Apple", 196L),
                new Stock("L&T", 53L),
                new Stock("Meta", 228L),
                new Stock("HU", 7L),
                new Stock("TI", 32L),
                new Stock("Twitter", 42L),
                new Stock("SBI", 92L),
                new Stock("HDFC", 55L),
                new Stock("ICICI", 73L));
    }
}