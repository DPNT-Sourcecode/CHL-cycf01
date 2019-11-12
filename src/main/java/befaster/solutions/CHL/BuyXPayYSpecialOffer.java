package befaster.solutions.CHL;

import java.util.Map;

public class BuyXPayYSpecialOffer extends SpecialOffer implements Comparable<BuyXPayYSpecialOffer>{
    private char sku;
    private int quantity;
    private Integer price;
    private int ranking;

    public BuyXPayYSpecialOffer(char sku, int quantity, Integer price) {
        this(sku, quantity, price, 1);
    }

    public BuyXPayYSpecialOffer(char sku, int quantity, Integer price, int ranking) {
        this.sku = sku;
        this.quantity = quantity;
        this.price = price;
        this.ranking = ranking;
    }

    public int getQuantity() {
        return quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public void apply(Map<Item, Integer> quantityByItem) {

    }

    @Override
    public int compareTo(BuyXPayYSpecialOffer other) {
        return this.ranking - other.ranking;
    }
}
