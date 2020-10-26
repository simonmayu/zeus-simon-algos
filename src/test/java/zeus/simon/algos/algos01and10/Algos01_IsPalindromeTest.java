package zeus.simon.algos.algos01and10;


import org.junit.Assert;
import org.junit.Test;

public class Algos01_IsPalindromeTest {

    @Test
    public void isPalindromeTest() {
        Algos01_IsPalindrome v = new Algos01_IsPalindrome();
        Assert.assertEquals(true, v.isPalindrome(null));
        Assert.assertEquals(true,v.isPalindrome(""));
        Assert.assertEquals(true,v.isPalindrome(" race a E-car "));
        Assert.assertEquals(false,v.isPalindrome("race a car"));
    }
}
