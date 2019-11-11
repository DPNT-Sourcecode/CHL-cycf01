package befaster.solutions.CHL;

import java.util.Comparator;
import java.util.Map;

public abstract class SpecialOffer implements Comparable<SpecialOffer> {

    public abstract void apply(Map<Item, Integer> quantityByItem);

}



