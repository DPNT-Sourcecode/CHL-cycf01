package befaster.solutions.CHL;

import java.util.HashMap;
import java.util.Map;

public class CheckliteSolution {

    private static Item ITEM_A = new Item('A', 50);
    private static Item ITEM_B = new Item('B', 30);
    private static Item ITEM_C = new Item('C', 20);
    private static Item ITEM_D = new Item('D', 15);

    private static SpecialOffer SPECIAL_OFFER_ITEM_A = new SpecialOffer(3, 130);
    private static SpecialOffer SPECIAL_OFFER_ITEM_B = new SpecialOffer(2, 45);

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

        ITEM_A.setSpecialOffer(SPECIAL_OFFER_ITEM_A);
        ITEM_B.setSpecialOffer(SPECIAL_OFFER_ITEM_B);
    }

    public Integer checklite(String skus) {
        if(inputIsInvalid(skus)) {
            return -1;
        }

        Integer total = 0;
        Map<Character, Integer> quantityBySku = new HashMap<>();

        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);
            if(skuIsInvalid(sku)) {
                return -1;
            }

            Item item = catalog.get(sku);
            if(item != null) {
                total += item.getPrice();

                if(!quantityBySku.containsKey(sku)) {
                    quantityBySku.put(sku, 0);
                }
                Integer quantityForThisSku = quantityBySku.get(sku);
                quantityBySku.put(sku, ++quantityForThisSku);

                if (discountApplies(quantityBySku, item)) {
                    total -= getDiscountFor(item);
                    quantityBySku.put(sku, 0);
                }
            }
        }
        return total;
    }

    private boolean inputIsInvalid(String input) {
        return input == null;
    }

    private boolean skuIsInvalid(char sku) {
        return !catalog.containsKey(sku);
    }

    private boolean discountApplies(Map<Character, Integer> quantityBySku, Item item) {
        if (item.getSpecialOffer() != null) {
            Integer quantity = quantityBySku.get(item.getSku());

            return quantity == item.getSpecialOffer().getQuantity();
        }
        return false;
    }

    private Integer getDiscountFor(Item item) {
        Integer priceWithoutDiscount = item.getSpecialOffer().getQuantity() * item.getPrice();
        return priceWithoutDiscount - item.getSpecialOffer().getPrice();
    }
}
