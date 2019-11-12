package befaster.solutions.CHL;

import java.util.Map;

public class BuyXGetYForFree extends SpecialOffer {
    private char targetSKU;

    public BuyXGetYForFree(char sku, int quantity, char targetSKU) {
        super(sku, quantity);
        this.targetSKU = targetSKU;
    }

    public char getTargetSKU() {
        return targetSKU;
    }

    @Override
    public void apply(Map<ItemAtPrice, Integer> quantityByItemAtPrice) {

    }
}

