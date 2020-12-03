package factory;

import stock.Stock;
import stock.StockDirection;

import java.util.Random;

public class StockFactory {

    public static final Random random = new Random();

    private static Stock stock;

    public static Stock getStock(StockDirection stockDirection) {
      stock = new Stock(stockDirection);

      switch (stockDirection) {
          case INITIAL:
              // Initial stock amount decided by ProductFactory due to amount limitations unknown by StockFactory
              break;
          case BUY:
              stock.setAmount(random.nextInt(5));
              break;
          case SELL:
              stock.setAmount(random.nextInt(4));
              break;
          case TRANSPORT:
              stock.setAmount(random.nextInt(3));
              break;
          case PRODUCTION:
              stock.setAmount(random.nextInt(9));
              break;
          case QUARANTAINE:
              stock.setAmount(random.nextInt(3));
              break;
          case RESERVATION:
              stock.setAmount(random.nextInt(7));
              break;
      }

      return stock;
    }
}
