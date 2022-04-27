public class FirstTest {
    public static void main(String[] args){
        BinaryTree tree1 = new BinaryTree();
        tree1.insert(17);
        tree1.insert(2);
        tree1.insert(3);
        tree1.insert(6);
        tree1.insert(18);
        tree1.insert(4);
        tree1.insert(92);
        tree1.insert(8);
        tree1.insert(10);
        tree1.insert(5);
        tree1.insert(11);
        tree1.insert(21);
        tree1.insert(9);
        tree1.displayTree();                            //output: [17, 2, 3, 6, 4, 5, 8, 10, 9, 11, 18, 92, 21]
        System.out.println(tree1.nodeWithoutChildren());//output: 4
        System.out.println(tree1.theLongestPath());     //output: 6

        BinaryTree tree2 = new BinaryTree();
        tree2.insert(7);
        tree2.insert(2);
        tree2.insert(15);
        tree2.insert(6);
        tree2.insert(21);
        tree2.insert(0);
        tree2.insert(12);
        tree2.insert(8);
        tree2.displayTree();                            //output: [7, 2, 0, 6, 15, 12, 8, 21]
        System.out.println(tree2.nodeWithoutChildren());//output: 4
        System.out.println(tree2.theLongestPath());     //output: 3

        BinaryTree tree3 = new BinaryTree();
        tree3.insert(7);
        tree3.insert(2);
        tree3.insert(15);
        tree3.insert(6);
        tree3.insert(21);
        tree3.insert(0);
        tree3.insert(12);
        tree3.insert(8);
        tree3.displayTree();                            //output: [7, 2, 0, 6, 15, 12, 8, 21]
        System.out.println(tree3.nodeWithoutChildren());//output: 4
        System.out.println(tree3.theLongestPath());     //output: 3

        tree1.isEqual(tree2);                           //output: NOT EQUAL
        tree1.isEqual(tree3);                           //output: NOT EQUAL
        tree2.isEqual(tree3);                           //output: EQUAL
    }
}
