/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Doctor;
import Business.Role.HospitalEnterpriseAdmin;
import Business.Role.LabTechnician;
import Business.Role.PrimaryCareProvider;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name){
        super(name, Enterprise.EnterpriseType.HospitalEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new HospitalEnterpriseAdmin());
        roles.add(new PrimaryCareProvider());
        roles.add(new Doctor());
        roles.add(new LabTechnician());
        return roles;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
