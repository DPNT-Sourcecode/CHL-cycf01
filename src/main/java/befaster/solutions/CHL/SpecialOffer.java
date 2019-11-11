package befaster.solutions.CHL;

public class SpecialOffer {

    private int quantity;
    private Integer price;

    public SpecialOffer(int quantity, Integer price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Integer getPrice() {
        return price;
    }
}
