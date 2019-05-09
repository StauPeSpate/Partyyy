/**
 * GraphMain.java
 * This class helps to test the Graph.java to see if it is working as expected
 * @version 1.0.0
 * @author Gabriel Petcu
 */
public class GraphMain {

    public static void main(String[] args) {
        Profile person01 = new Profile("George", "Alexandrescu", 23, 12, 2003, "Bucuresti", "Romania",
                "Romanian", "GeorgeAlex@gmail.com", new String[]{"x", "y"});
        Profile person02 = new Profile("Ben", "Poarch", 10, 05, 2003, "Cardiff", "Wales",
                "English", "benpoarch@yahoo.com", new String[]{"a,b,c"});
        Profile person03 = new Profile("Gabriel", "Petcu", 12, 5, 1999, "Madrid", "Spain",
                "Spanish", "GabrielPetcu@yahoo.com", new String[]{"music", "lmao", "x"});
        Profile person04 = new Profile("Ryan", "Jones", 15, 02, 2001, "Paris", "France",
                "French", "JonesRyan@gmail.com", new String[]{"cow,movies,actor"});
        Profile person05 = new Profile("Aenise", "Lujb", 5, 12, 2006, "Lubliiana", "Slovakia",
                "Slovakian", "LuEnise@yahoo.com", new String[]{"Supernatural", "animes", "attack on titan"});
        Profile person06 = new Profile("Ioanna", "Dascalu", 31, 12, 1980, "Budapest", "Hungary",
                "Hungarian", "Dasana@google.com", new String[]{"monkey", "Kimi no nawa", "Oshiete"});
        Profile person07 = new Profile("Zichel", "Jackson", 22, 03, 1970, "Varsow", "Poland",
                "Polish", "MichaelJackson@facebook.com", new String[]{"Music", "jazz", "bad and boujee"});

        Profile[] users = new Profile[]{person01, person02, person03, person04, person05, person06, person07};

        BST binarySearch = new BST();
        binarySearch = FileReader.readProfileSet("input");
        binarySearch.insertProfile(person01);
        binarySearch.insertProfile(person02);
        binarySearch.insertProfile(person03);
        binarySearch.insertProfile(person04);
        binarySearch.insertProfile(person05);
        binarySearch.insertProfile(person06);
        binarySearch.insertProfile(person07);


        Graph friendShip = new Graph("GraphFriends.txt", binarySearch);

        friendShip.letsBeFriends(person01, person02);
        friendShip.letsBeFriends(person01, person03);
        friendShip.letsBeFriends(person03, person02);
        friendShip.letsBeFriends(person04, person01);
        friendShip.letsBeFriends(person04, person02);
        friendShip.letsBeFriends(person04, person03);

       // binarySearch.printAlphabetical();

        BST[] finalTree = friendShip.friendRecommandations(users);
        for(int i = 0 ; i < finalTree.length ; i++)
        {
            try {
                System.out.println(users[i].getFirstName() + "This is a recommandation for you: ");
                finalTree[i].printAlphabetical();

            } catch (NullPointerException e){
                System.out.println(users[i].getFirstName()+ "There are no friends for you ");
            }
            System.out.println("\n");
        }

    }
}
