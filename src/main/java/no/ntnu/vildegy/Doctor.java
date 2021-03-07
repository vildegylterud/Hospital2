/**
 * this abstract class extends the the class Employee
 */
package no.ntnu.vildegy;

public abstract class Doctor extends Employee {

        protected Doctor(String firstName, String lastName, String socialSecurityNumber) {
            super(firstName, lastName, socialSecurityNumber);
        }

    /** a abstract method for setting diagnosis on patient
     *
     * @param patient
     * @param diagnosis the diagnosis of the patient
     */
    public abstract void setDiagnosis(Patient patient,String diagnosis);

}



