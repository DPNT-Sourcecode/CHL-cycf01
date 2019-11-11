package befaster.solutions.CHL;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CheckliteSolutionTest {

    @Parameterized.Parameters(name = "Test with items [{0}] should result in a total of {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"", Integer.valueOf(0)},
                {"A", Integer.valueOf(50)},
                {"ABCD", Integer.valueOf(115)},
                {"AAA", Integer.valueOf(130)},
                {"ABCD", Integer.valueOf(115)},
                {"AAAAA", Integer.valueOf(200)},
                {"AAAAAA", Integer.valueOf(250)},
                {"BB", Integer.valueOf(45)},
                {"EEB", Integer.valueOf(80)},
                {null, Integer.valueOf(-1)},
                {"!", Integer.valueOf(-1)}
        });
    }

    @Parameterized.Parameter
    public String itemsInBasket;

    @Parameterized.Parameter(1)
    public Integer expectedTotal;

    private CheckliteSolution checkliteSolution;

    @Before
    public void setUp() {
        checkliteSolution = new CheckliteSolution();
    }

    @Test
    public void shouldCalculateTotalOfItemsInBasket() {
        Integer checkoutValue = checkliteSolution.checklite(itemsInBasket);

        Assert.assertEquals(expectedTotal, checkoutValue);
    }
}
