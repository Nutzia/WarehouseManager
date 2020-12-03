package product;

import state.*;
import stock.Stock;
import stock.StockDirection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Product {
    public String description;
    public List stockMovements = new LinkedList<Stock>();
    public int minStock;
    public int maxStock;
    public int critStock;
    public StateContext stateCtx;

    public Product(String description, int minStock, int maxStock, int critStock){
        this.description = description;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.critStock = critStock;
    }

    public void increaseStock(int amount) {
        Stock incStock = new Stock(amount, StockDirection.IN);

        stockMovements.add(incStock);
    }

    public void decreaseStock(int amount) {
        Stock decStock = new Stock(amount, StockDirection.OUT);

        stockMovements.add(decStock);
    }
}
