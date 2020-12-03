package stock;

public class Stock {
    public int amount;
    public StockDirection direction;
    //public int numberMovements;

    //public int getNumberMovements(){
      //  return numberMovements;
    //}
    public Stock(StockDirection direction) {
        this.direction = direction;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
