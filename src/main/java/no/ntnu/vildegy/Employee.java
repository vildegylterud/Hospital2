/**
 * this class extends the abstract class Person
 */
package no.ntnu.vildegy;

public class Employee extends Person{


        public Employee(String firstName, String lastName, String socialSecurityNumber) {
            super(firstName, lastName, socialSecurityNumber);
        }

        /** to striong method from the super class Person
         *
         * @return the first name, last name andre the social security number to the employee
         */
        @Override
        public String toString() {
            return super.toString();
        }
    }


