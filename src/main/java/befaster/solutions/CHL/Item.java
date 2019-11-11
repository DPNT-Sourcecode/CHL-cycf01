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

    public void setSku(char sku) {
        this.sku = sku;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}



