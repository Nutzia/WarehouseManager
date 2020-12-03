package stock;

public class Stock {
    public int amount;
    public StockDirection direction;

    public Stock(int amount, StockDirection direction) {
        this.amount = amount;
        this.direction = direction;
    }
}
