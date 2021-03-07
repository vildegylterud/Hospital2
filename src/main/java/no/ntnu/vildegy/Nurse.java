/**
 * this class extends the abstract class Employee
 */
package no.ntnu.vildegy;

public class Nurse extends Employee{

    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * to String method from the super class Employee
     * @return first name, last name and the social security number
     */
    public String toString() {
       return super.toString();
    }
}
