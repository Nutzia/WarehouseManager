package factory;

import java.util.Random;
import product.Product;
import product.ProductType;

public class ProductFactory {

    public static final Random random = new Random();

    private static Product product;

    public static Product getProduct(ProductType productType){
        //product = new Product();
        switch (productType) {
            case MONSTERA:
                //product = new Product();
                break;
            case PANCAKEPLANT:
                //product = new Product();
                break;
            case SANSEVERIA:
                //product = new Product();
                break;
            case PEACELILY:
                //product = new Product();
                break;
            default:
                return null;
        }
    return product;
    }
}
