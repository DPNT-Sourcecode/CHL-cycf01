package befaster.solutions.CHL;

import java.util.Map;

public abstract class SpecialOffer {

    private int quantity;
    private char sku;

    public SpecialOffer(char sku, int quantity) {
        this.sku = sku;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public char getSku() {
        return sku;
    }

    public abstract void apply(Map<ItemAtPrice, Integer> quantityByItem);

}



