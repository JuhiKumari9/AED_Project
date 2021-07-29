/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.RequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class User extends Person{
  private MedicalDetails medicalDetails;
  private String userType;
  private RequestDirectory requestDirectory;
    public User( String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, String userType,Role role) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.userType = userType;
    }

    public MedicalDetails getMedicalDetails() {
        if(medicalDetails == null){
        medicalDetails = new MedicalDetails();
        }
        return medicalDetails;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public RequestDirectory getRequestDirectory() {
        if(requestDirectory == null){
            requestDirectory = new RequestDirectory();
        }
        return requestDirectory;
    }
    
    
       
    @Override
    public String toString() {
        return getName();
    }

    
}
