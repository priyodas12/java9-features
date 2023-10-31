package io.priyotech.github;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductStock {

    private final String name;
    private final BigDecimal value;

    public ProductStock(String name, BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public static List<ProductStock> getStocks(){
        List<ProductStock> productStockList=new ArrayList<>();
        productStockList.add(new ProductStock("Sigma", BigDecimal.valueOf(11100.83)));
        productStockList.add(new ProductStock("Loyal", BigDecimal.valueOf(90000.88)));
        productStockList.add(new ProductStock("Alpha", BigDecimal.valueOf(1400.89)));
        productStockList.add(new ProductStock("Gamma", BigDecimal.valueOf(11900.32)));
        productStockList.add(new ProductStock("Macro", BigDecimal.valueOf(7780.90)));
        productStockList.add(new ProductStock("TechInfo", BigDecimal.valueOf(5477.45)));
        productStockList.add(new ProductStock("Hudson", BigDecimal.valueOf(72500.82)));
        productStockList.add(new ProductStock("Big4", BigDecimal.valueOf(78200.81)));
        return productStockList;
    }

    @Override
    public String toString() {
        return "{ "+this.getName()+", "+this.getValue()+" }";
    }
}
