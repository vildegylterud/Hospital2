/**
 * a abstract class Person. Patient, Doctor and Emplyee extends this class.
 */
package no.ntnu.vildegy;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Person(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * to String method
     * @return the first name, last name and the social security number to the person
     */
    @Override
    public String toString() {
        return "Person: " +
                "First name: '" + firstName + "\n" +
                "Last name: '" + lastName + "\n" +
                "Social security number: '" + socialSecurityNumber + "\n";
    }
}


