/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OnlineReceptionist;

import Business.Organization.Organization;
import Business.Role.Role;

/**
 *
 * @author kunal
 */
public class OnlineReceptionist extends Business.Person.Person{
    private Organization org;

    public OnlineReceptionist(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role, Organization org) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.org = org;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
    
    

    @Override
    public String toString() {
        return getName();
    }    
}
