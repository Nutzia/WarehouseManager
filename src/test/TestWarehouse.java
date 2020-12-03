package test;

import product.Product;
import stock.Stock;

import java.util.Iterator;

public class TestWarehouse {

    //Create a warehouse where each product is unique
    //Create list of products where each product has a random quantity and a random amount of stockmovements
    //Keep in mind that each product has a state

    public static void main(String[] args) {
        Product muismat = new Product("Muismat", 10, 100, 90);

        muismat.increaseStock(25);
        muismat.increaseStock(7);
        muismat.decreaseStock(20);

        for (Iterator i = muismat.stockMovements.iterator(); i.hasNext();) {
            Stock s = (Stock)i.next();

            System.out.println("" + s.amount + " - " + s.direction);
        }
    }
}
