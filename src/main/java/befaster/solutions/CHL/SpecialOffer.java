package befaster.solutions.CHL;

import java.util.Comparator;

public class SpecialOffer implements Comparable<SpecialOffer> {

    private int quantity;
    private Integer price;
    private int ranking;

    public SpecialOffer(int quantity, Integer price) {
        this(quantity, price, 1);
    }

    public SpecialOffer(int quantity, Integer price, int ranking) {
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
    public int compareTo(SpecialOffer other) {
        return this.ranking - other.ranking;
    }

}
