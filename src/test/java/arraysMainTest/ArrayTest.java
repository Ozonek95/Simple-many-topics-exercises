package arraysMainTest;

import arrays.Main;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void testCheckArray(){
        int[] testArray = new int[5];

        testArray[0]=5;
        testArray[1]=2;
        testArray[2]=6;
        testArray[3]=2;
        testArray[4]=11;

        int[] result = Main.copyArray(testArray);
        Assert.assertArrayEquals(testArray,result);
    }
}
