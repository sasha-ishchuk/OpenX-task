import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondTest extends BinaryTree{

    //insert elements to Binary Tree by reading it from file
    public void readFromFile(String path) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(path));

            while (scanner.hasNext()){
                int element = scanner.nextInt();
                insert(element);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File isn't found. Check your filepath " + path + ".");
        }
    }

    public static void main(String[] args){
        BinaryTree tree1 = new BinaryTree();
        tree1.insert(4);
        tree1.insert(14);
        tree1.insert(3);
        tree1.insert(7);
        tree1.insert(5);
        tree1.insert(35);
        tree1.insert(45);
        tree1.insert(17);
        tree1.insert(10);
        tree1.insert(9);
        tree1.insert(19);
        tree1.insert(2);
        tree1.insert(0);
        tree1.insert(1);
        tree1.insert(27);
        tree1.insert(2);
        tree1.insert(2);
        tree1.insert(8);
        tree1.insert(19);
        tree1.insert(20);
        tree1.insert(1);
        tree1.displayTree();                            //output: [4, 3, 2, 0, 1, 1, 2, 2, 14, 7, 5, 10,
                                                        //          9, 8, 35, 17, 19, 27, 19, 20, 45]
        System.out.println(tree1.nodeWithoutChildren());//output: 6
        System.out.println(tree1.theLongestPath());     //output: 7

        BinaryTree tree2 = new BinaryTree();
        tree2.insert(7);
        tree2.insert(2);
        tree2.insert(5);
        tree2.insert(68);
        tree2.insert(41);
        tree2.insert(3);
        tree2.insert(42);
        tree2.insert(14);
        tree2.insert(6);
        tree2.insert(1);
        tree2.insert(9);
        tree2.insert(29);
        tree2.insert(100);
        tree2.displayTree();                            //output: [7, 2, 1, 5, 3, 6, 68, 41, 14, 9, 29, 42, 100]
        System.out.println(tree2.nodeWithoutChildren());//output: 7
        System.out.println(tree2.theLongestPath());     //output: 4

        BinaryTree tree3 = new BinaryTree();
        tree3.insert(9);
        tree3.insert(0);
        tree3.insert(5);
        tree3.insert(98);
        tree3.insert(1);
        tree3.insert(97);
        tree3.insert(2);
        tree3.insert(81);
        tree3.insert(72);
        tree3.insert(52);
        tree3.insert(5);
        tree3.insert(6);
        tree3.insert(1);
        tree3.insert(9);
        tree3.insert(2);
        tree3.insert(88);
        tree3.insert(1);
        tree3.insert(27);
        tree3.insert(76);
        tree3.insert(2);
        tree3.insert(8);
        tree3.displayTree();                            //output: [9, 0, 5, 1, 2, 1, 1, 2, 2, 5, 6, 8,
                                                        //          98, 97, 81, 72, 52, 9, 27, 76, 88]
        System.out.println(tree3.nodeWithoutChildren());//output: 6
        System.out.println(tree3.theLongestPath());     //output: 7

        tree1.isEqual(tree2);                           //output: NOT EQUAL
        tree1.isEqual(tree3);                           //output: NOT EQUAL
        tree2.isEqual(tree3);                           //output: NOT EQUAL

        SecondTest t1 = new SecondTest();
        t1.readFromFile("C:\\Users\\Sasha\\OneDrive\\Рабочий стол\\test1.txt");
        t1.displayTree();                            //output: [7, 0, 4, 0, 3, 6, 9, 12, 9, 11, 35, 20, 65]
        System.out.println(t1.nodeWithoutChildren());//output: 5
        System.out.println(t1.theLongestPath());     //output: 4

        SecondTest t2 = new SecondTest();
        t2.readFromFile("C:\\Users\\Sasha\\OneDrive\\Рабочий стол\\test2.txt");
        t2.displayTree();                            //output: [28, 8, 1, 0, 4, 3, 20, 18, 9, 14, 12, 25, 23,
                                                     //          34, 29, 30, 31, 33, 50, 40, 38, 39, 43]
        System.out.println(t2.nodeWithoutChildren());//output: 7
        System.out.println(t2.theLongestPath());     //output: 6

        t1.isEqual(t1);                              //output: EQUAL
        t1.isEqual(t2);                              //output: NOT EQUAL
    }
}
