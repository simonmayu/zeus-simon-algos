package zeus.simon.algos.algos01and10;


import org.junit.Assert;
import org.junit.Test;

public class Algos03_IsTwoNumSumToGivenValueTest {

    @Test
    public void SortArrayGetTwoSumToGivenValueVersionTest() {
        Algos03_TwoNumSumToGivenValue t = new Algos03_TwoNumSumToGivenValue();
        Assert.assertArrayEquals(new int[]{2, 5}, t.getTwoNumSumToGivenValue(new int[]{1, 2, 3, 6, 8, 11}, 10));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValue(new int[]{1, 2, 4, 8}, 0));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValue(new int[]{}, 42));
    }


}
