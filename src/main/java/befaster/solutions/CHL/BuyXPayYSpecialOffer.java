package befaster.solutions.CHL;

import java.util.Map;

public class BuyXPayYSpecialOffer extends SpecialOffer {
    private int quantity;
    private Integer price;

    public BuyXPayYSpecialOffer(int quantity, Integer price) {
        super(quantity, price);
    }

    @Override
    public void apply(Map<Item, Integer> quantityByItem) {

    }
}

