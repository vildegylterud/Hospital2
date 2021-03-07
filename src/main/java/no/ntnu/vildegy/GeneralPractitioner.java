/**
 * this class extends the abstract class Doctor
 */
package no.ntnu.vildegy;

public class GeneralPractitioner extends Doctor{

    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis){
        patient.setDiagnosis(diagnosis);
    }
}
