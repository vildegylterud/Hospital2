/**
 * A hospital with a name and different departments
 */
package no.ntnu.vildegy;

import java.util.ArrayList;

public class Hospital {

    private String hospitalName;
    private ArrayList<Department> departments;


    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    /**
     * The method adds a new department in the deparments list, if its doesnt exicst already
     * @param department
     */
    public void addDepartments(Department department) {
    if(!departments.contains(department)){ //checks if the department exist in the departments-list
        departments.add(department); //if not, the new department will be added to the list
    } else {
        throw new IllegalArgumentException("This department already excist!"); // if it exist, an exception is thrown to the user
        }
    }


    @Override
    public String toString() {
        return "Hospital: " +
                "HospitalName: '" + hospitalName + "\n" +
                "Departments: " + departments;
    }
}
