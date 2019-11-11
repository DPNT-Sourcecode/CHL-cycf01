package befaster.solutions.CHL;

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
        items = new HashSet<Item>();
        Item itemA = mock(Item.class);
        
        checkliteSolution = new CheckliteSolution(items);
    }

    @Test
    public void shouldCalculateTotalWithOneItem() {
        String basket = "A";
        Integer checkoutValue = checkliteSolution.checklite(basket);
    }
}

