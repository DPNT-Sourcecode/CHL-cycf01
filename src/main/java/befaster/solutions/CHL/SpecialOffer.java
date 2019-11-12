package befaster.solutions.CHL;

import java.util.Map;

public abstract class SpecialOffer {

    private int quantity;
    private char targetSKU;

    public SpecialOffer(int quantity, char targetSKU) {
        this.quantity = quantity;
        this.targetSKU = targetSKU;
    }

    public char getTargetSKU() {
        return targetSKU;
    }

    public abstract void apply(Map<ItemAtPrice, Integer> quantityByItem);

}


