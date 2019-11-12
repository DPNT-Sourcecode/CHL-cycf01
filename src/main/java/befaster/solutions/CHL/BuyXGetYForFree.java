package befaster.solutions.CHL;

import java.util.Map;

public class BuyXGetYForFree extends SpecialOffer {

    private char sku;
    private int quantity;
    private char targetSKU;

    public BuyXGetYForFree(char sku, int quantity, char targetSKU) {
        this.sku = sku;
        this.quantity = quantity;
        this.targetSKU = targetSKU;
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
