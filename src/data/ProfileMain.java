/**
 * ProfileMain.java
 *
 * @version 1.0.0
 * @author Gabriel Petcu
 */

import java.util.ArrayList;
public class ProfileMain {
    public static void main(String[] args)
    {

        Profile person1 = new Profile("Gabriel","Petcu",12,5,1999,"Brasov","Romania",
                "romanian","GabrielPetcu@yahoo.com", new String[]{"music","lmao","x"});
        person1.setNationaliy("Bulgarian");
        System.out.println(person1.toString());

        //System.out.println(person1.getDateOfBirth());
        // System.out.println(person1.getFirstName());
    }
}
