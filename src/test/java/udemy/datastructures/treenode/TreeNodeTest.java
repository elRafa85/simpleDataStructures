package udemy.datastructures.treenode;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import udemy.datastructures.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafae on 6/23/2017.
 */
public class TreeNodeTest {

    private TreeNode treenode;

    @Before
    public void init(){
        treenode = new TreeNode(7);
    }

    @Test
    public void testAddNodePre(){
        treenode.addNode(5);
        treenode.addNode(1);
        treenode.addNode(8);
        treenode.addNode(10);
        treenode.addNode(6);

        List<Integer> list = new ArrayList<Integer>(7);
        int[] expected = {1,5,6,7,8,10};
        treenode.preOrderTraversal(list);
        int[] actual = ArrayUtils.toPrimitive(list.toArray(new Integer[1]));
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddNodePost(){
        treenode.addNode(5);
        treenode.addNode(1);
        treenode.addNode(8);
        treenode.addNode(10);
        treenode.addNode(6);

        List<Integer> list = new ArrayList<Integer>(7);
        treenode.postOrderTraversal(list);
        int[] expected = {10,8,7,6,5,1};
        int[] actual = ArrayUtils.toPrimitive(list.toArray(new Integer[1]));
        Assert.assertArrayEquals(expected,actual);
    }


}
