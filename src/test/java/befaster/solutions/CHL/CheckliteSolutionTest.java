package befaster.solutions.CHL;

import org.junit.Before;
import org.junit.Test;

public class CheckliteSolutionTest {

    CheckliteSolution checkliteSolution;

    @Before
    public void setUp() {
        checkliteSolution = new CheckliteSolution();
    }

    @Test
    public void shouldCalculateTotalWithOneItem() {
        String basket = "A";
        Integer checkoutValue = checkliteSolution.checklite(basket);
    }
}
