package befaster.solutions.CHL;

import java.math.BigDecimal;

public class Item {

    private String sku;
    private BigDecimal price;

    public Item(String sku, BigDecimal price) {
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
