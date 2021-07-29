/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestReporter;

import Business.Role.Role;

/**
 *
 * @author kunal
 */
public class TestReporter extends Business.Person.Person{

    public TestReporter(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
    }

    @Override
    public String toString() {
        return getName();
    }   
}
