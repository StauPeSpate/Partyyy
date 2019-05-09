/**
 * BSTMain.java
 * This class helps to test the BSTN.java to see if it is working as expected
 * @version 1.0.0
 * @author Gabriel Petcu
 */
public class BSTMain {
    public static void main(String[] args)

    {
        Profile person01 = new Profile("George","Alexandrescu",23,12,2003,"Bucuresti","Romania",
                "Romanian","GeorgeAlex@gmail.com",new String[]{"x","y"});
        Profile person02 = new Profile("Ben","Poarch",10,05,2003,"Cardiff","Wales",
                "English","benpoarch@yahoo.com",new String[]{"a,b,c"});
        Profile person03 = new Profile("Gabriel","Petcu",12,5,1999,"Madrid","Spain",
                "Spanish","GabrielPetcu@yahoo.com", new String[]{"music","lmao","x"});
        Profile person04 = new Profile("Ryan","Jones",15,02,2001,"Paris","France",
                "French","JonesRyan@gmail.com",new String[]{"cow,movies,actor"});
        Profile person05 = new Profile("Aenise","Lujb",5,12,2006,"Lubliiana","Slovakia",
                "Slovakian","LuEnise@yahoo.com",new String[]{"Supernatural","animes","attack on titan"});
        Profile person06 = new Profile("Ioanna","Dascalu",31,12,1980,"Budapest","Hungary",
                "Hungarian","Dasana@google.com",new String[]{"monkey","Kimi no nawa","Oshiete"});
        Profile person07 = new Profile("Zichel","Jackson",22,03,1970,"Varsow","Poland",
                "Polish","MichaelJackson@facebook.com",new String[]{"Music","jazz","bad and boujee"});
        BST binarytree = new BST();
        BSTNode node1 = new BSTNode(person01);
        BSTNode node2 = new BSTNode(person02);
        BSTNode node3 = new BSTNode(person03);
        BSTNode node4 = new BSTNode(person04);
        BSTNode node5 = new BSTNode(person05);
        BSTNode node6 = new BSTNode(person06);
        BSTNode node7 = new BSTNode(person07);
        binarytree.insertProfile(person01);
        binarytree.insertProfile(person02);
        binarytree.insertProfile(person03);
        binarytree.insertProfile(person04);
        binarytree.insertProfile(person05);
        binarytree.insertProfile(person06);
        binarytree.insertProfile(person07);

        //binarytree.display();
        System.out.println(binarytree.root.getL().getProfile());
        System.out.println(binarytree.root.getR().getProfile());
        System.out.println(binarytree.root.getR().getL().getProfile());
        System.out.println(binarytree.root.getL().getR().getProfile());
        System.out.println(binarytree.root.getL().getL().getProfile());
        System.out.println(binarytree.root.getR().getR().getProfile());
        binarytree.printAlphabetical();




    }
}
