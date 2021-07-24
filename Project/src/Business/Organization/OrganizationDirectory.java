/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Organization> orgList) {
        this.orgList = orgList;
    }
    
    public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.BackgroundCheck.getValue())){
            organization = new BackgroundCheckOrg(name);
            //organization = new DoctorOrganization(name);
          // organization=new ClinicOrganisation(name);
          
            orgList.add(organization);
        }
        return organization;
    } 
}
