package befaster.solutions.CHL;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Set;

@RunWith(Parameterized.class)
public class CheckliteSolutionTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"A", Integer.valueOf(50)},
            {"ABCD", Integer.valueOf(115)},
            {"AAA", Integer.valueOf(130)},
                {"ABCD", Integer.valueOf(115)},
                {"AAAAA", Integer.valueOf(200)},
                {"AAAAAA", Integer.valueOf(260)},
                {"BB", Integer.valueOf(45)},
                {null, Integer.valueOf(-1)},
                {"!", Integer.valueOf(-1)}
        });
    }

    private CheckliteSolution checkliteSolution;

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
    public void shouldCalculateTotalOfItemsInBasket(String itemsInBasket, Integer expectedTotal) {
        Integer checkoutValue = checkliteSolution.checklite(itemsInBasket);

        Assert.assertEquals(expectedTotal, checkoutValue);
    }

    /*
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

    @Test
    public void shouldCalculateItemTotalWithMultipleSpecialOffers() {
        String basket = "AAAAAA";
        Integer checkoutValue = checkliteSolution.checklite(basket);

        Assert.assertEquals(Integer.valueOf(260), checkoutValue);
    }

    @Test
    public void shouldReturnMinusOneIfInputIsNull() {
        String invalidInput = null;
        Integer returnedValue = checkliteSolution.checklite(invalidInput);

        Assert.assertEquals(Integer.valueOf(-1), returnedValue);
    }

    @Test
    public void shouldReturnMinusOneIfInputContainsInvalidSku() {
        String invalidInput = "!";
        Integer returnedValue = checkliteSolution.checklite(invalidInput);

        Assert.assertEquals(Integer.valueOf(-1), returnedValue);
    }
    */
}





