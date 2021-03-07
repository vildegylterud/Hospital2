/**
 * This class extends the abstract class Person, and also implements the interface class Diagnosible
 */
package no.ntnu.vildegy;

public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";

    protected Patient(String firsName, String lastName, String socialSecurityNumber){
        super(firsName, lastName, socialSecurityNumber);
    }

    // Get- and set method
    protected String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * uses the toString method to the abstract class Person
     * @return the first name, last name andre the social security number to the employee
     */
    public String toString() {
        return super.toString();
    }


}
