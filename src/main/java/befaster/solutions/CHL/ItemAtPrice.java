package befaster.solutions.CHL;

import java.util.Objects;

public class ItemAtPrice {

    private char sku;
    private Integer price;

    public ItemAtPrice(char sku, Integer price) {
        this.sku = sku;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAtPrice itemAtPrice = (ItemAtPrice) o;
        return sku == itemAtPrice.sku &&
                Objects.equals(price, itemAtPrice.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, price);
    }
}
