package product;

import state.*;
import stock.Stock;
import stock.StockDirection;

import java.util.LinkedList;
import java.util.List;

public abstract class Product {
    public List stockMovements = new LinkedList<Stock>();
    public int minStock;
    public int maxStock;
    public int critStock;
    public StateContext stateCtx;



    public Product(int minStock, int maxStock, int critStock){
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.critStock = critStock;
    }

    public void doStockMovement(Stock stock) {
        stockMovements.add(stock);
    }

    @Override
    public String toString() {
        return "Product{" +
                "stockMovements=" + stockMovements +
                ", minStock=" + minStock +
                ", maxStock=" + maxStock +
                ", critStock=" + critStock +
                ", stateCtx=" + stateCtx +
                '}';
    }
}
