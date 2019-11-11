package befaster.solutions.CHL;

public class SpecialOffer {

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
}

