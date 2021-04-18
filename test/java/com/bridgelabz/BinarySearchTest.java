package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenNumbers_WhenAddedToBinaryTree_ShouldReturnExpectedOutput() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        Integer root=myBinaryTree.root.key;
        Assertions.assertEquals(56,root);
        Integer firstRight=myBinaryTree.root.right.key;
        Assertions.assertEquals(70,firstRight);
        myBinaryTree.add(95);
        myBinaryTree.add(60);
        myBinaryTree.add(65);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        Integer rightOfFirstRight=myBinaryTree.root.right.right.key;
        Integer firstRights_lefts_rights_left=myBinaryTree.root.right.left.right.left.key;
        Assertions.assertEquals(95,rightOfFirstRight);
        Assertions.assertEquals(63,firstRights_lefts_rights_left);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13, size);
    }
    @Test
    public void testSearchMethod(){
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        Integer root=myBinaryTree.root.key;
        Assertions.assertEquals(56,root);
        Integer firstRight=myBinaryTree.root.right.key;
        Assertions.assertEquals(70,firstRight);
        myBinaryTree.add(95);
        myBinaryTree.add(60);
        myBinaryTree.add(65);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        Assertions.assertTrue(myBinaryTree.search(95));
    }


}
