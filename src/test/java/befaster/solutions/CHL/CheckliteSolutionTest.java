package befaster.solutions.CHL;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.mock;

public class CheckliteSolutionTest {

    private CheckliteSolution checkliteSolution;
    private Set<Item> items;

    @Before
    public void setUp() {
        checkliteSolution = new CheckliteSolution();
    }

    @Test
    public void shouldReturnZeroForEmptyBasket() {
        Integer checkoutValue = checkliteSolution.checklite("");
        Assert.assertEquals(Integer.valueOf(0), checkoutValue);
    }

    @Test
    public void shouldCalculateTotalWithItemInBasket() {
        String basket = "A";
        Integer checkoutValue = checkliteSolution.checklite(basket);

        Assert.assertEquals(Integer.valueOf(50), checkoutValue);
    }

    @Test
    public void shouldCalculateTotalWithOneItemInBasket() {
        String basket = "A";
        Integer checkoutValue = checkliteSolution.checklite(basket);

        Assert.assertEquals(Integer.valueOf(50), checkoutValue);
    }

    @Test
    public void shouldCalculateTotalWithMoreThanOneItemInBasket() {
        String basket = "ABCD";
        Integer checkoutValue = checkliteSolution.checklite(basket);

        Assert.assertEquals(Integer.valueOf(115), checkoutValue);
    }

    @Test
    public void shouldCalculateItemTotalWhenSpecialOfferAppliesToProductA() {
        String basket = "AAA";
        Integer checkoutValue = checkliteSolution.checklite(basket);

        Assert.assertEquals(Integer.valueOf(130), checkoutValue);
    }

    @Test
    public void shouldCalculateItemTotalWhenSpecialOfferAppliesToProductB() {
        String basket = "BB";
        Integer checkoutValue = checkliteSolution.checklite(basket);

        Assert.assertEquals(Integer.valueOf(45), checkoutValue);
    }
}

