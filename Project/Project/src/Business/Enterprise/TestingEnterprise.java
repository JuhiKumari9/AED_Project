/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class TestingEnterprise extends Enterprise {
    
    public TestingEnterprise(String name){
        super(name, Enterprise.EnterpriseType.TestingEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
//        roles.add(new Assistant());
//        roles.add(new MentalHealthEnterpriseAdmin());
//        roles.add(new Psychiatrist());
//        roles.add(new Facilitator());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
