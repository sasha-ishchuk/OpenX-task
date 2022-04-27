import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node root;
    List<Integer> preorderList = new ArrayList<>();

    private Node insertNode(Node node, int element){
        if(node == null){
            return new Node(element);
        }
        if(element < node.data){
            node.left = insertNode(node.left, element);
        }
        else{
            node.right = insertNode(node.right, element);
        }
        return node;
    }

    //check if given node is a leaf-node
    private boolean isLeaf(Node node){
        return node.left == null && node.right == null;
    }

    private int withoutChildren(Node node){
        if(node == null){
            return 0;
        }

        if(isLeaf(node)){
            return 1;
        }
        else {
            return withoutChildren(node.left) + withoutChildren(node.right);
        }
    }

    private int longestPath(Node node){
        if(node == null){
            return -1;
        }
        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);

        return Math.max(leftPath + 1, rightPath + 1);
    }

    private boolean equal(Node firstNode, Node secondNode){
        if(firstNode == null && secondNode == null){
            return true;
        }
        if(firstNode == null || secondNode == null){

            return false;
        }

        return firstNode.data == secondNode.data
                && equal(firstNode.left, secondNode.left)
                && equal(firstNode.right, secondNode.right);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        preorderList.add(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    //add element to Binary Tree
    public void insert(int element){
        root = insertNode(root, element);
    }

    //check how many leaf-nodes (nodes without children) there are in Binary Tree
    public int nodeWithoutChildren(){
        return withoutChildren(root);
    }

    //check the largest number of edges in a path from the root node to a leaf node (it is tree's height)
    public int theLongestPath(){
        return longestPath(root);
    }

    //check if one of Binary Tree instance is equal to another
    public void isEqual(BinaryTree tree){
        if(this.theLongestPath() != tree.theLongestPath()){
            System.out.println("NOT EQUAL");
            return;
        }

        if(equal(this.root, tree.root)){
            System.out.println("EQUAL");
        }
        else {
            System.out.println("NOT EQUAL");
        }
    }

    //print Binary Tree in "preorder" order
    public void displayTree(){
        preOrder(root);
        System.out.println(preorderList);
    }
}
