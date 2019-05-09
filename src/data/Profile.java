/**
 * Profile.java
 *
 * @version 1.4.0
 * @author Gabriel Petcu
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Profile {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private String townResidence;
    private String countryResidence;
    private String nationality;
    private String emailAdress;
    private String[] interest;
    private Profile p;
    private ArrayList<Profile> friend = new ArrayList<>();

    /**
     *
     * Constructor to create user's profile.
     * @param firstName representing the person's first name.
     * @param lastName representing the person's last name.
     * @param day representing the person's day of birth.
     * @param month representing the person's month of birth.
     * @param year  representing the person's year of birth.
     * @param townResidence representing the person's town residence.
     * @param countryResidence  representing the person's country residence.
     * @param nationaliy    representing the person's nationality.
     * @param emailAdress   representing the person's email adress.
     * @param interest  representing the person's interests.
     */

    public Profile(String firstName, String lastName, int day, int month, int year, String townResidence, String countryResidence,
                   String nationaliy, String emailAdress, String[] interest)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.townResidence = townResidence;
        this.countryResidence = countryResidence;
        this.nationality = nationaliy;
        this.emailAdress = emailAdress;
        setInterests(interest);

    }
    /*
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    */

    /**
     * Get method returning person's first name.
     * @return First name of the person.
     */
    public String getFirstName()
    {
        return firstName;
    }
    /*
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    */

    /**
     * Get method returning person's name.
     * @return Last name of the person.
     */

    public String getLastName()
    {
        return lastName;
    }

    /**
     * Set method to set the town residence of the person.
     * @param townResidence representing the town residence of the person.
     */
    public void setTownResidence(String townResidence)
    {
        this.townResidence = townResidence;
    }

    /**
     * Get method returning persons's town residence.
     * @return Town of residence of the person.
     */
    public String getTownResidence()
    {
        return townResidence;
    }

    /**
     * Set method to set the country residence of the person.
     * @param countryResidence representing the country residence of the person.
     */

    public void setCountryResidence(String countryResidence)
    {
        this.countryResidence = countryResidence;
    }

    /**
     * Get method returning person's country residence.
     * @return Country of residence of the person.
     */
    public String getCountryResidence()
    {
        return countryResidence;
    }

    /**
     * Set method to set the nationality of the person
     * @param nationality representing the nationality of the person.
     */

    public void setNationaliy(String nationality)
    {
        this.nationality = nationality;
    }

    /**
     * Get method returning person's nationality.
     * @return Nationality of the person.
     */
    public String getNationality()
    {
        return nationality;
    }

    /**
     * Set method to set interests of the person as an array.
     * @param interests representing the interests of the person.
     */

    public void setInterests(String[] interests)

    {
        interest = new String[interests.length];
        int count;
        for(count = 0; count<interests.length;count++) {
            this.interest[count] = interests[count];
        }
    }

    /**
     *  Get method returning person's date of birth.
     * @return Date of birth as integers.
     */

    public String getDateOfBirth()
    {
        return day + "/" + month + "/" + year;
    }

    /**
     * Get method returning person's interests.
     * @return interests as an Array of Strings.
     */

    public String getInterests()
    {
        String allInterests ="";
        allInterests = allInterests + interest[0];
        for(int interestCount = 1 ; interestCount < interest.length ; interestCount++)
        {
            String space =",";
            allInterests = allInterests + space + interest[interestCount];

        }
        return allInterests;
    }

    /**
     * Method to add friends to a profile.
     * @param p adding a profile to the friend list.
     */
    public void addFriend (Profile p)
    {
        friend.add(p);
    }

    /**
     * Get method returning person's friend that is on position i.
     * @param i is the friend on position i.
     * @return the profile of the friend that is on position i.
     */

    public Profile getFriend(int i)
    {
        return friend.get(i);

    }

    /**
     * Method that returns number of friends of the profile.
     * @return number of friends of a person.
     */
    public int numOfFriends()
    {
        int numOfFriends = friend.size();
        return numOfFriends;

    }

    /**
     * toString method for debugging objects in java.
     * @return All the data of a user's profile.
     */
    public String toString()
    {
        return "This person's name is: " + firstName + " " + lastName +" " + "\n"
                +"His nationalty is: " + nationality + " " + "\n"
                +"His town and country residence: " + townResidence + " " + countryResidence + "\n"
                +"His email adress: " + emailAdress + "\n"
                +"Date of birth is: " + getDateOfBirth() + "\n"
                +"His interests: " + getInterests() + "\n"
                +"His friends: " + Arrays.toString(friend.toArray());
    }

}
