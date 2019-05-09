/**
 * This class reads data from a file.
 * @version 1.3.0
 * @author Gabriel Petcu
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    /**
     * @param in reads the data from file.
     * @return person's data from the Scanner.
     */

   public static Profile readProfile (Scanner in) {
        String lastName = in.next();
        String firstName = in.next();
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        String townResidence = in.next();
        String countryResidence = in.next();
        String nationality = in.next();
        String emailAdress = in.next();
        in.skip(",");
        String allInterests = in.nextLine();

        // Scanner to read all interests.
        Scanner interests = new Scanner(allInterests);
        interests.useDelimiter(",");

        Profile person = new Profile(firstName,lastName,day,month,year,townResidence,countryResidence,nationality,emailAdress,readInterests(interests));
        return person;
    }

    /**
     * Scanner for all interests from file.
     * @param interests representing all interests from the file.
     * @return interests as an Array.
     */

    private static String[] readInterests(Scanner interests)
    {
        ArrayList<String> interestArrayList = new ArrayList<>();
        while(interests.hasNext())
        {   String interest = interests.next();
            interestArrayList.add(interest);
        }
        // We might want change the arraylist to array.
        String[] interestToArray = new String[interestArrayList.size()];
        interestToArray = interestArrayList.toArray(interestToArray);
        return interestToArray;
    }

    /**
     * This method will create a binary search tree and insert all the profiles from the file.
     * @param in represents the data from the file.
     * @return the binary tree with all the data read from the Scanner.
     */

    private static BST readProfileSet(Scanner in)
    {
        BST binaryTree = new BST();

        while(in.hasNext())
        {
            String thisLine = in.nextLine();
            Scanner line = new Scanner(thisLine);
            line.useDelimiter(",");
            binaryTree.insertProfile(readProfile(line));

            line.close();
        }
        return binaryTree;
    }

    /**
     * This method checks either the file exists or not.
     * If the file doesn't exist throw an error.
     * @param filename representing the file name.
     * @return all the data from the file
     */
    public static BST readProfileSet(String filename) {
            File inputFile = new File(filename);
            Scanner in = null;

            try {
                in = new Scanner(inputFile);
            } catch (FileNotFoundException e) {
                System.out.println("Cannot open" + " " +filename);
                System.exit(0);
            }
            return FileReader.readProfileSet(in);
        }

}
