/**
 * A department has a name, different employees and different patient
 */
package no.ntnu.vildegy;

import java.util.ArrayList;
import java.util.Objects;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;
    private ArrayList<Patient> patients;


    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    /**
     * The method adds a new employee to the list of employees if it does not exist in the employee list already
     * If the employee aleady exist in the employee list, an exception will be thrown to the user
     * @param employee
     */
    public void addEmployee(Employee employee) {
        if(!employees.contains(employee)) { //checks if a employee with same name and social security number already exist
            employees.add(employee);
        } else if(!employees.contains(employee.getSocialSecurityNumber())) { //checks if a employee with same SSN exist
            employees.add(employee);
        } else {
            throw new IllegalArgumentException("A employee with the same social security number already excist in our system");
        }
    }

    /**
     * This method adds a new patient to the list of patient, if it does not exist in the patient list already
     * If the patient already exist in the patient list, an exception will be thrown to the user
     * @param patient
     */
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) { //checks if a patient with same name and social security number already exist
            patients.add(patient);
        } else if (!patients.contains(patient.getSocialSecurityNumber())) { //checks if a patient with same SSN exist
            patients.add(patient);
        } else {
            throw new IllegalArgumentException("A patient with the same social security number already excist in our system");
        }
    }

    /**
     *
     * @return a hash code value for this object.
     */
        @Override
        public int hashCode () {
            return Objects.hash(departmentName);
        }

/**
 * dette er en del av opppgave 4, og jeg har løst den feil - vent
 *
        public void remove (Person spesificPerson){
            if (employees.contains(spesificPerson)) {//checks if the persons are in the employees list
                employees.remove(spesificPerson);
            } else if(patients.contains(spesificPerson)) { //checks if the persons are in the patient list
                patients.remove(spesificPerson);
            } else {
                throw new IllegalArgumentException("The person you want to remove could not be found!");
            }
        }
 **/


    /**
     *
     * @param o, the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise.
     */
        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Department that = (Department) o;
            return departmentName.equals(that.departmentName);
        }

    @Override
    public String toString() {
        return "Department: " +
                "DepartmentName: " + departmentName +
                "Employees: " + employees +
                "Patients: " + patients;
    }
}

