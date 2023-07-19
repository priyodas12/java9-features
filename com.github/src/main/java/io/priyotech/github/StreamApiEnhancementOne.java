package io.priyotech.github;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**Both will be short circuit operation works on predicate true value*/
public class StreamApiEnhancementOne {
    public static void main(String[] args) {
        List<Stock> allStocks=StockUtils.getAllStocks();

        List<Stock> sortedReversedStocks = allStocks
                .stream()
                .sorted(Comparator.comparingLong(Stock::getPriceInBn).reversed())
                .toList();
        System.out.println(sortedReversedStocks);
        List<Stock> sortedStocks = allStocks
                .stream()
                .sorted(Comparator.comparingLong(Stock::getPriceInBn))
                .toList();
        System.out.println(sortedStocks);
        List<String> stockStockLessThan300L = sortedReversedStocks.stream()
                .takeWhile(TakeWhileDrop::isStockGreaterThan200L)
                .peek(stock -> System.out.println("takeWhile:: " + stock))
                .map(Stock::getName).toList();

        List<String> stockGreaterThan200L = sortedStocks.stream()
                .dropWhile(TakeWhileDrop::isStockLessThan300L)
                .peek(stock -> System.out.println("dropWhile:: " + stock))
                .map(Stock::getName).toList();

        System.out.println("takeWhile op::"+stockStockLessThan300L);
        System.out.println("dropWhile op::"+stockGreaterThan200L);
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

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", priceInBn=" + priceInBn +
                '}';
    }
}

class TakeWhileDrop{
    public static boolean isStockLessThan300L(Stock stock){
        return stock.getPriceInBn()<300L;
    }
    public static boolean isStockGreaterThan200L(Stock stock){
        return stock.getPriceInBn()>200L;
    }

}

class StockUtils{
    public static List<Stock> getAllStocks() {
        return List.of(new Stock("Google", 537L),
                new Stock("Apple", 296L),
                new Stock("L&T", 153L),
                new Stock("Meta", 628L),
                new Stock("HU", 170L),
                new Stock("TI", 32L),
                new Stock("Twitter", 332L),
                new Stock("SBI", 92L),
                new Stock("HDFC", 55L),
                new Stock("ICICI", 73L));
    }
}