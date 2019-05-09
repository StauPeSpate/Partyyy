/**
 * BSTNodeMain.java
 * This class helps to test the BSTNode.java to see if it is working as expected.
 * @version 1.0.0
 * @author Gabriel Petcu
 */
public class BSTNodeMain {

    public static void main(String[] args)
    {
    Profile person2 = new Profile("George","Alexandrescu",23,12,2003,"Bucuresti","Romania",
            "Romanian","GeorgeAlex@gmail.com",new String[]{"x","y"});
    Profile person3 = new Profile("Ben","Poarch",10,05,2003,"Cardiff","Wales",
            "English","benpoarch@yahoo.com",new String[]{"a,b,c"});

    BSTNode node1 = new BSTNode(person2);
    BSTNode node2 = new BSTNode(person3);
    node1.setR(node1);
    node2.setL(node2);

    //Get profile data from right node
    System.out.println(node1.getR());

    //Get profile data from left node
    System.out.println(node2.getL());

    }
}
