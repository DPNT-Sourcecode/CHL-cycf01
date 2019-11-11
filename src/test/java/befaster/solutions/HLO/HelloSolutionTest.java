package befaster.solutions.HLO;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloSolutionTest {

    private HelloSolution sut = new HelloSolution();

    @Test
    public void shouldSayHelloWorld() {
        String friendName = "Luis";
        String returnedMessage = sut.hello(friendName);
        assertEquals("Hello, Luis", returnedMessage);
    }
}

