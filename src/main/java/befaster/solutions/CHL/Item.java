package befaster.solutions.CHL;

public class Item {

    private char sku;
    private Integer price;
    private SpecialOffer specialOffer;

    public Item(char sku, Integer price) {
        this.sku = sku;
        this.price = price;
    }

    public char getSku() {
        return sku;
    }

    public Integer getPrice() {
        return price;
    }

    public SpecialOffer getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(SpecialOffer specialOffer) {
        this.specialOffer = specialOffer;
    }
}

