package test;

import factory.ProductFactory;
import product.Product;
import product.ProductType;
import stock.Stock;

import java.util.Iterator;

public class TestWarehouse {

    //Create a warehouse where each product is unique
    //Create list of products where each product has a random quantity and a random amount of stockmovements
    //Keep in mind that each product has a state

    private Product[] numberOfProducts;

    public static void main(String[] args) {
        TestWarehouse testWarehouse = new TestWarehouse();
        testWarehouse.compile();
        testWarehouse.print();
    }

    public void compile() {
        ProductType[] productTypes = ProductType.values();

        numberOfProducts = new Product[5 + ProductFactory.random.nextInt(15)];

        for (int i = 0; i < numberOfProducts.length; i++) {
            numberOfProducts[i] = ProductFactory.getProduct(productTypes[ProductFactory.random.nextInt(productTypes.length)]);
        }
    }

    public void print() {
        for (int i = 0; i < numberOfProducts.length; i++) {
            System.out.println("\nProduct " + (i + 1) + ": " + numberOfProducts[i].toString());
        }
    }
}
