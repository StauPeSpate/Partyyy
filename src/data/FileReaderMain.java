/**
 * This class tests FileReader.java to see if it works as expected.
 * @version 1.0.0
 * @author Gabriel Petcu
 */
public class FileReaderMain {
    public static void main(String[] args)
    {
        BST binaryTree = new  BST();
        binaryTree = FileReader.readProfileSet("input");
        System.out.println(binaryTree.getRoot().getProfile());
        System.out.println(binaryTree.getRoot().getR().getProfile());
        System.out.println(binaryTree.getRoot().getL().getProfile());
    }
}
