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

    private Map<Item> catalog;

    public CheckliteSolution() {
    }

    private void initCatalog() {
        catalog = new HashMap();
        catalog.add(ITEM_A);
        catalog.add(ITEM_B);
        catalog.add(ITEM_C);
        catalog.add(ITEM_D);
    }

    public Integer checklite(String skus) {
        Integer total = 0;

        /*
        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);

        }
        */

        return total;
    }
}


