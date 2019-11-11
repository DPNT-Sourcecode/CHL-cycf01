package befaster.solutions.CHL;

import java.util.Map;

public class BuyXGetYForFree extends SpecialOffer {

    private char sku;
    private int quantity;
    private char skuOfFreeItem;

    public BuyXGetYForFree(char sku, int quantity, char skuOfFreeItem) {
        this.sku = sku;
        this.quantity = quantity;
        this.skuOfFreeItem = skuOfFreeItem;
    }

    public char getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public char getSkuOfFreeItem() {
        return skuOfFreeItem;
    }

    @Override
    public void apply(Map<Item, Integer> quantityByItem) {

    }
}

