package factory;

import java.util.Random;

import product.*;
import stock.Stock;
import stock.StockDirection;

public class ProductFactory {

    public static final Random random = new Random();

    private static Product product;

    private static int[] getCapacities() {
        int[] randomCapacities = new int[3];

        int min = random.nextInt(10) + 1;
        int max = min + random.nextInt(20) + 1;
        int crit = Math.round(min / 2);

        randomCapacities[0] = min;
        randomCapacities[1] = max;
        randomCapacities[2] = crit;

        return randomCapacities;
    }

    public static Product getProduct(ProductType productType){
        int[] capacities = getCapacities();

        switch (productType) {
            case MONSTERA:
                product = new Monstera(capacities[0], capacities[1], capacities[2]);
                break;
            case PANCAKEPLANT:
                product = new PancakePlant(capacities[0], capacities[1], capacities[2]);
                break;
            case SANSEVERIA:
                product = new Sanseveria(capacities[0], capacities[1], capacities[2]);
                break;
            case PEACELILY:
                product = new PeaceLily(capacities[0], capacities[1], capacities[2]);
                break;
            default:
                return null;
        }

        int numberMovements = 1 + random.nextInt(10);
        StockDirection[] stockMovements = StockDirection.values();

        for (int i = 0; i < numberMovements; i++) {
            StockDirection randomDirection;

            if (i == 0) {
                randomDirection = StockDirection.INITIAL;
            } else {
                randomDirection = stockMovements[random.nextInt(stockMovements.length)];
            }

            Stock stock = StockFactory.getStock(randomDirection);

            if (i == 0) {
                int randomInitialStockAmount = random.nextInt(product.maxStock - product.minStock) + product.minStock;
                stock.setAmount(randomInitialStockAmount);
            }

            product.doStockMovement(stock);
        }

        return product;
    }
}
