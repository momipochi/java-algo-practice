package com.example.uniqueBinarySearchTreesII;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.classes.TreeNode;

public class UniqueBinarySearchTreesIITest {
    @Test
    public void testGenerateTrees() {
        List<TreeNode> cases = new ArrayList<>();
        TreeNode c1 = new TreeNode(1);
        c1.right = new TreeNode(2);
        c1.right.right = new TreeNode(3);

        TreeNode c2 = new TreeNode(1);
        c2.right = new TreeNode(3);
        c2.right.left = new TreeNode(2);

        TreeNode c3 = new TreeNode(2);
        c3.left = new TreeNode(1);
        c3.right = new TreeNode(3);

        TreeNode c4 = new TreeNode(3);
        c4.left = new TreeNode(1);
        c4.left.right = new TreeNode(2);

        TreeNode c5 = new TreeNode(3);
        c5.left = new TreeNode(2);
        c5.left.left = new TreeNode(1);

        cases.add(c1);
        cases.add(c2);
        cases.add(c3);
        cases.add(c4);
        cases.add(c5);

        List<TreeNode> ts = UniqueBinarySearchTreesII.generateTrees(3);
        for (int i = 0; i < cases.size(); i++) {
            assertEquals(cases.get(i), ts.get(i));
        }
    }
}
