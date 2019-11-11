package befaster.solutions.CHL;

import java.math.BigDecimal;

public class Item {

    private String sku;
    private Integer price;
    private SpecialOffer specialOffer;

    public Item(String sku, Integer price) {
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

