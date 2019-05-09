/**
 * BSTNode.java
 *
 * @version 1.3.0
 * @author Gabriel Petcu
 */

public class BSTNode {
    private Profile data;
    private BSTNode l;
    private BSTNode r;

    /**
     * This class constructs a node of a binary tree and inserts personal data about a person.
     * @param data takes all the details about a person.
     */

    public BSTNode(Profile data)
    {
        this.data = data;

    }

    /**
     * This method sets the right node of a binary tree.
     * @param r represents the right node of a binary tree.
     */

    public void setR(BSTNode r)
    {
        this.r = r ;
    }

    /**
     * This method sets the left node of a binary tree.
     * @param l represents the left node of a binary tree.
     */
    public void setL(BSTNode l)
    {
        this.l = l ;
    }

    /**
     * Get method returning the right node of the binary tree.
     * @return the right node of the binary tree.
     */

    public BSTNode getR()
    {
        return r;
    }

    /**
     * Get method returning the left node of the binary tree.
     * @return the left node of the binary tree.
     */

    public BSTNode getL()
    {
        return l;
    }

    /**
     * Get method returning personal data about a Person.
     * @return all the data about a person from Profile.java.
     */

    public Profile getProfile()
    {
        return data;
    }

    /**
     * toString method that helps for debugging.
     * @return the data from node that holds personal data about a person.
     */

    public String toString()
    {
        return "This node data is: "+ "\n"+data;
    }
}
