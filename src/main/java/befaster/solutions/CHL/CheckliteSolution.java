package befaster.solutions.CHL;

import befaster.runner.SolutionNotImplementedException;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckliteSolution {

    private static Item ITEM_A = new Item("A", BigDecimal.valueOf(50));
    private static Item ITEM_B = new Item("B", BigDecimal.valueOf(30));
    private static Item ITEM_C = new Item("C", BigDecimal.valueOf(20));
    private static Item ITEM_D = new Item("D", BigDecimal.valueOf(15));

    private Map<String, Item> catalog;

    public CheckliteSolution() {
        initCatalog();
    }

    private void initCatalog() {
        catalog = new HashMap();
        catalog.put(ITEM_A.getSku(), ITEM_A);
        catalog.put(ITEM_B.getSku(), ITEM_B);
        catalog.put(ITEM_C.getSku(), ITEM_C);
        catalog.put(ITEM_D.getSku(), ITEM_D);
    }

    public Integer checklite(String sku) {
        Integer total = 0;

        Item item = catalog.get(sku);
        if(item != null) {
            total += item.getPrice();
        }
        /*
        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);

        }
        */

        return total;
    }
}



