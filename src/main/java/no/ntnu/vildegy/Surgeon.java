/**
 * this class extends the abstract class Doctor
 */
package no.ntnu.vildegy;

public class Surgeon extends Doctor {

    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     *
     * @param patient
     * @param diagnosis the diagnosis of the patient
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
