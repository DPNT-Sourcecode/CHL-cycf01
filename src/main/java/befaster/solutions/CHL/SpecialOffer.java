package befaster.solutions.CHL;

import java.util.Map;

public abstract class SpecialOffer {

    private char targetSKU;

    public SpecialOffer(char targetSKU) {
        this.targetSKU = targetSKU;
    }

    public char getTargetSKU() {
        return targetSKU;
    }

    public abstract void apply(Map<Item, Integer> quantityByItem);

}


