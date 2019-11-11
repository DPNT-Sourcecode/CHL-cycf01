package befaster.solutions.CHL;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CheckliteSolution {

    private static Item ITEM_A = new Item('A', 50);
    private static Item ITEM_B = new Item('B', 30);
    private static Item ITEM_C = new Item('C', 20);
    private static Item ITEM_D = new Item('D', 15);

    private Map<Character, Item> catalog;

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

    public Integer checklite(String skus) {
        Integer total = 0;

        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);

            Item item = catalog.get(sku);
            if(item != null) {
                total += item.getPrice();
            }
        }

        return total;
    }
}






