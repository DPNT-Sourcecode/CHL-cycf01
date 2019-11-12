package befaster.solutions.CHL;

import java.util.Map;

public class BuyXGetYForFree extends SpecialOffer {

    private char sku;
    private int quantity;

    public BuyXGetYForFree(char sku, int quantity, char targetSKU) {
        super(targetSKU);
        this.sku = sku;
        this.quantity = quantity;
    }

    public char getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void apply(Map<Item, Integer> quantityByItem) {

    }
}


