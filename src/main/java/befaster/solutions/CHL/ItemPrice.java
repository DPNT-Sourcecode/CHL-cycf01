package befaster.solutions.CHL;

import java.util.Objects;

public class ItemPrice {

    private char sku;
    private Integer price;

    public ItemPrice(char sku, Integer price) {
        this.sku = sku;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPrice itemPrice = (ItemPrice) o;
        return sku == itemPrice.sku &&
                Objects.equals(price, itemPrice.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, price);
    }
}


