import wprowadzenie.Testing.LettersCounter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GivenWordTest {

    String input;
    int expectedValue;

    public GivenWordTest(String input, int expectedValue) {
        this.input = input;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection words(){
        return Arrays.asList(new Object[][]{{"bababaja",4},{"bicz",3}});
    }





    @Test

    public void testHowManyLettersKind() {

        LettersCounter lettersCounter = new LettersCounter();


        System.out.println("Parameterized word is "+ input);

        Assert.assertEquals(expectedValue,lettersCounter.numberOfB(input));

    }
}


