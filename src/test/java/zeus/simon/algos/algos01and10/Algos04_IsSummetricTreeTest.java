package zeus.simon.algos.algos01and10;

import org.junit.Assert;
import org.junit.Test;
import zeus.simon.algos.Helper;
import zeus.simon.algos.TreeNode;

public class Algos04_IsSummetricTreeTest {

    @Test
    public void testRecursiveVersion() {
        Algos04_IsSummetricTree s = new Algos04_IsSummetricTree();
        TreeNode tree1 = Helper.buildTree(1, 2, 2, 4, 8, 8, 4);
        TreeNode tree2 = Helper.buildTree(1, 2, 2, 4, 8, 8, null);
        Assert.assertEquals(true, s.isSymmetricTreeRecursive(tree1));
        Assert.assertEquals(false, s.isSymmetricTreeRecursive(tree2));
    }

    @Test
    public void testIterativeVersion() {
        Algos04_IsSummetricTree s = new Algos04_IsSummetricTree();
        TreeNode tree1 = Helper.buildTree(1, 2, 2, 4, 8, 8, 4);
        TreeNode tree2 = Helper.buildTree(1, 2, 2, 4, 8, 8, null);
        Assert.assertEquals(true, s.isSymmetricTreeIterative(tree1));
        Assert.assertEquals(false, s.isSymmetricTreeIterative(tree2));
    }
}
