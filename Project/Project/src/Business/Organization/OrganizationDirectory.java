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
        if (type.getValue().equals(Type.ExpertTherapistOrganization.getValue())){
            organization = new ExpertTherapistOrganization(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.GeneralTherapistOrganization.getValue())){
            organization = new GeneralTherapistOrganization(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.OnlineReceptionistOrganization.getValue())){
            organization = new OnlineReceptionistOrganization(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.Depression.getValue())){
            organization = new Depression(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.Anxiety.getValue())){
            organization = new Anxiety(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.YouthMentalHealth.getValue())){
            organization = new YouthMentalHealth(name); 
            orgList.add(organization);
        } else if (type.getValue().equals(Type.PTSD.getValue())){
            organization = new PTSD(name); 
            orgList.add(organization);
        }
        return organization;
    } 
}
