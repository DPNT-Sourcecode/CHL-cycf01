package befaster.solutions.CHL;

import java.util.*;

public class CheckliteSolution {

    private static Item ITEM_A = new Item('A', 50);
    private static Item ITEM_B = new Item('B', 30);
    private static Item ITEM_C = new Item('C', 20);
    private static Item ITEM_D = new Item('D', 15);
    private static Item ITEM_E = new Item('E', 40);

    private static SpecialOffer SPECIAL_OFFER_ITEM_A_1 = new BuyXPayYSpecialOffer('A', 5, 200, 1);
    private static SpecialOffer SPECIAL_OFFER_ITEM_A_2 = new BuyXPayYSpecialOffer('A', 3, 130, 2);
    private static SpecialOffer SPECIAL_OFFER_ITEM_B = new BuyXPayYSpecialOffer('B', 2, 45);

    private Map<Character, Item> catalog;
    private Map<Character, List<SpecialOffer>> offersBySKU;
    private List<SpecialOffer> offers;

    public CheckliteSolution() {
        initCatalog();
    }

    private void initCatalog() {
        catalog = new HashMap();
        catalog.put(ITEM_A.getSku(), ITEM_A);
        catalog.put(ITEM_B.getSku(), ITEM_B);
        catalog.put(ITEM_C.getSku(), ITEM_C);
        catalog.put(ITEM_D.getSku(), ITEM_D);

        offers.add(SPECIAL_OFFER_ITEM_A_1);
        offers.add(SPECIAL_OFFER_ITEM_A_2);
        offers.add(SPECIAL_OFFER_ITEM_B);

        /*
        ITEM_A.addSpecialOffer(SPECIAL_OFFER_ITEM_A_1);
        ITEM_A.addSpecialOffer(SPECIAL_OFFER_ITEM_A_2);
        ITEM_B.addSpecialOffer(SPECIAL_OFFER_ITEM_B);
        */
    }

    public Integer checklite(String skus) {
        if(inputIsInvalid(skus)) {
            return -1;
        }

        Map<Item, Integer> quantityByItem = new HashMap<>();
        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);
            if(skuIsInvalid(sku)) {
                return -1;
            }

            Item item = catalog.get(sku);
            if(item != null) {
                if(!quantityByItem.containsKey(item)) {
                    quantityByItem.put(item, 0);
                }
                Integer quantityForThisSku = quantityByItem.get(item);
                quantityByItem.put(item, ++quantityForThisSku);
            }
        }

        // Apply offers and calculate total


        Integer total = 0;
        Iterator<Map.Entry<Item, Integer>> iterator = quantityByItem.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Item, Integer> itemAndQuantityEntry = iterator.next();
            total += totalForItem(itemAndQuantityEntry.getKey(), itemAndQuantityEntry.getValue(), quantityByItem);
        }

        return total;
    }

    private boolean inputIsInvalid(String input) {
        return input == null;
    }

    private boolean skuIsInvalid(char sku) {
        return !catalog.containsKey(sku);
    }



    private Integer totalForItem(Item item, int quantity, Map<Item, Integer> quantityByItem) {
        int total = 0;
        int numberOfItemUnitsLeft = quantity;
        SpecialOffer bestOfferApplicable;
        do {
            bestOfferApplicable = getBestOfferApplicableFor(item, numberOfItemUnitsLeft, quantityByItem);
            if(bestOfferApplicable != null) {
                numberOfItemUnitsLeft -= bestOfferApplicable.getQuantity();
                total += bestOfferApplicable.getPrice();
            }
        } while (bestOfferApplicable != null);

        return total + numberOfItemUnitsLeft * item.getPrice();
    }

    private SpecialOffer getBestOfferApplicableFor(Item item, int numberOfItems, Map<Item, Integer> quantityByItem) {
        if(item.hasSpecialOffers()) {
            List<SpecialOffer> specialOffers = item.getSpecialOffers();
            Collections.sort(specialOffers);

            for(SpecialOffer specialOffer : specialOffers) {
                if(numberOfItems >= specialOffer.getQuantity()) {
                    return specialOffer;
                }
            }
        }

        return null;
    }
}

