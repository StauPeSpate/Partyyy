/**
 * BST.java
 *
 * version 1.4.0
 * @author Gabriel Petcu
 */


import java.util.Stack;

public class BST {
    public BSTNode root;

    /**
     * This class constructs the binary tree using nodes.
     * Empty constructor that sets the root of the binary tree to null.
     */

    public BST()
        {
        this.root = null;
        }

    /**
     * This method inserts profiles to the binary tree.
     * First profile will be the root.
     * Every other profile will be added recursively.
     * @param p represents the data for a Profile.
     */

    public void insertProfile (Profile p)
        {
            BSTNode node = new BSTNode(p);
            if(root == null) {
                root = node;
            } else {
                addRecursive(root, node);
            }
        }

    /**
     * This method adds recursively nodes to the binary search tree.
     * @param current represents the current node.
     * @param inserted represents the node that will be inserted into the binary search tree.
     */

    private void addRecursive(BSTNode current, BSTNode inserted)
        {
            if(inserted.getProfile().getFirstName().compareTo(current.getProfile().getFirstName()) > 0) {
                if (current.getR() == null) {
                    current.setR(inserted);
                } else {
                    addRecursive(current.getR(), inserted);
                }
            }else{
                if(current.getL()==null)
                {
                    current.setL(inserted);
                } else {
                    addRecursive(current.getL(),inserted);
                }
            }
        }

    /**
     * Get method returning the root of the binary search tree
     * @return root of the binary search tree.
     */
    public BSTNode getRoot()
    {
        return root;
    }

    /**
     * Method to display the root of the binary tree.
     */
    public void display()
    {
       System.out.println(root);

    }

    /**
     * Method to print the profiles in alphabetical order using stacks.
     */
    public void printAlphabetical() throws NullPointerException
    {
        Stack nodes = new Stack<>();
        BSTNode current = root;

        while(!nodes.isEmpty() || current != null)
        {
            if (current != null)
            {
                nodes.push(current);
                current = current.getL();
            } else {
                BSTNode node = (BSTNode) nodes.pop();
                System.out.printf("%s" , node.getProfile().getFirstName() + " " );
                current = node.getR();
            }
        }
    }

    /**
     * This method checks if a profile exists within a binary search tree.
     * This method is a recursive method to traverse the tree.
     * @param current representing the current node in the BST.
     * @param p representing the profile that node is holding
     * @return the profile within binary search tree, if it doesn't exist, return null.
     */
    private Profile containsNodeRecursive(BSTNode current, Profile p) {

        if (current == null) {
            return null;
        }
        if (p == current.getProfile()) {
            return p;
        }
        if(p.getFirstName().compareTo(current.getProfile().getFirstName()) < 0) {
            return containsNodeRecursive(current.getL(), p);

        } else {
            return containsNodeRecursive(current.getR(), p);
        }


    }

    /**
     * This method starts from the root of the binary tree to search a profile within binary search tree.
     * @param p representing the profile.
     * @return the profile recursively within binary search tree.
     */
    public Profile conatinsNode(Profile p)
    {
        return containsNodeRecursive(root, p);
    }
}
