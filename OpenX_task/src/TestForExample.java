public class TestForExample extends BinaryTree{

    public static void main(String[] args){
        BinaryTree t = new BinaryTree();
        t.root = new Node(5);
        t.root.left = new Node(3);
        t.root.left.left = new Node(2);
        t.root.left.right = new Node(5);
        t.root.right = new Node(7);
        t.root.right.left = new Node(1);
        t.root.right.right = new Node(0);
        t.root.right.right.left = new Node(2);
        t.root.right.right.right = new Node(8);
        t.root.right.right.right.right = new Node(5);
        t.displayTree();                                //output: [5, 3, 2, 5, 7, 1, 0, 2, 8, 5]
        System.out.println(t.nodeWithoutChildren());    //output: 5
        System.out.println(t.theLongestPath());         //output: 4

        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(5);
        tree.insert(7);
        tree.insert(1);
        tree.insert(0);
        tree.insert(2);
        tree.insert(8);
        tree.insert(5);
        tree.displayTree();                             //output: [5, 3, 2, 1, 0, 2, 5, 7, 5, 8]
        System.out.println(tree.nodeWithoutChildren()); //output: 4
        System.out.println(tree.theLongestPath());      //output: 4

        t.isEqual(tree);                                //output: NOT EQUAL
    }
}
