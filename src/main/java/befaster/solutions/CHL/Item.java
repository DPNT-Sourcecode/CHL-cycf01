package befaster.solutions.CHL;

import java.util.Objects;

public class Item {

    private char sku;
    private Integer price;
    //private List<SpecialOffer> specialOffers;

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

    /*
    public boolean hasSpecialOffers() {
        return specialOffers != null && specialOffers.size() > 0;
    }

    public List<SpecialOffer> getSpecialOffers() {
        return specialOffers;
    }

    public void addSpecialOffer(SpecialOffer specialOffer) {
        if(specialOffers == null) {
            specialOffers = new ArrayList<>();
        }
        this.specialOffers.add(specialOffer);
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return sku == item.sku;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }
}

