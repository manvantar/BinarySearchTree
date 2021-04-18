package com.bridgelabz;

public class BinarySearchTree<K extends Comparable<K>>{
    public BinaryNode<K> root;

    /*This method is used to initialize root variable
    */

    public void add(K key){
        this.root=this.addRecursively(root,key);

    }

    /*This method is used to add Nodes to BinaryTree is there is no value exist it will be set to root, later
    added nodes will be compared with root value, if less added to left of it else added to right, this is done
    Recursively
    @param current indicates the current node
    @param key indicates the key
    @return BinarytreeNode
     */

    private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }
    /* this method is used to get size of the tree
    @return size_of_the_tree
    */
    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(BinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) +
                this.getSizeRecursive(current.right);
    }

}
