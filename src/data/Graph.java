/**
 * Graph.java
 *
 * @author Gabriel Petcu
 * @version 1.0.3
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Graph {

    private String filename;
    private BST binaryTree;
    private ArrayList<Profile> users = new ArrayList<Profile>();

    /**
     * This class constructs a binary search tree and a file as input.
     * @param filename represents the filename as a String.
     * @param binaryTree represents the binary search tree inserted in Graph.
     */

    public Graph(String filename, BST binaryTree) {
        this.filename = filename;
        this.binaryTree = binaryTree;
    }

    /**
     * This method checks either the file exists or not.
     * If the file doesn't exist throw an error.
     * @param filename represets the name of the file
     */
    private void readFile(String filename) {
        File inputFile = new File(filename);
        Scanner in = null;
        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file: " + filename);
            System.exit(0);
        }
        readLine(in);
    }

    /**
     * This method reads a line from the file.
     * @param in represents the Scanner and the data read from the file
     */
    private void readLine(Scanner in) {
        while (in.hasNextLine()) {
            String curLine = in.nextLine();
            Scanner friends = new Scanner(curLine);

        }
    }

    /**
     *
     * @param friends representing the Scanner where we get the friends from.
     * @param p1 representing the first profile within the Scanner.
     * @param p2 representing the second profile within the Scanner.
     */

    private void existingProfiles(Scanner friends,Profile p1, Profile p2) {
        friends.useDelimiter(",");

        Profile profileOne = binaryTree.conatinsNode(p1);
        Profile profileTwo = binaryTree.conatinsNode(p2);
    }

    /**
     * This method verifies if 2 people are already friends
     * @param p1 represents first profile passed in the method.
     * @param p2 represents second profile passed in the method.
     * @return true if they are not friends.
     * @return false if they are already friends.
     */
    private boolean Friendship(Profile p1, Profile p2) {
        int count;
        int numOfFriends = p1.numOfFriends();
        boolean alreadyFriend = false;
        if (numOfFriends > 0) {
            for (count = 0; count < numOfFriends; count++) {
                if (p1.getFriend(count).equals(p2))
                    alreadyFriend = true;
            }

        }
        if (alreadyFriend) {
            return false;

        } else {
            return true;
        }

    }

    /**
     * This method adds a friend to a profile
     * but no before checking if they are already friends.
     * @param p1 represents the first profile passed in this method.
     * @param p2 represents the second profile passed in this method.
     */
    private void addFriend(Profile p1, Profile p2) {
        if (Friendship(p1, p2) == true) {
            p1.addFriend(p2);
        }
    }

    /**
     * This method recommands a friend to a profile if
     * that person have a person in common and they are not already friends.
     * @param users representing all the profiles stored as an array.
     * @return all the users a binary search tree.
     */
    public BST[] friendRecommandations(Profile[] users) {
        BST[] binaryTree = new BST[users.length];
        for (int i = 0; i < users.length; i++) {
            binaryTree[i] = new BST();

        for (i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].numOfFriends(); j++) {
                for (int l = 0; l < users[j].getFriend(j).numOfFriends(); l++) {

                    if(!Friendship(users[i],users[i].getFriend(j).getFriend(l)) && !users[i].equals(users[i].getFriend(j).getFriend(l)))
                        binaryTree[i].insertProfile(users[i].getFriend(j).getFriend(l));
                }}
            }
        }
        return binaryTree;
    }

    /**
     * Because being a friend means simmetry that automatically means that if person 1 is friend person 2
     * then person 2 is also friend with person 1
     * @param p1 representing first profile
     * @param p2 representing second profile
     */
    public void letsBeFriends(Profile p1 , Profile p2)
    {
        p1.addFriend(p2);
        p2.addFriend(p1);
    }
}

