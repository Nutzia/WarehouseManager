package product;

public enum ProductType {
    MONSTERA("Monstera"),
    PANCAKEPLANT("Pancake plant"),
    SANSEVERIA("Sanseveria"),
    PEACELILY ("Peace Lily");

    private String type;

    ProductType(String type) {
        this.type = type;
    }
}
