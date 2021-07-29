/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> entList = new ArrayList<Enterprise>();
    
    public ArrayList<Enterprise> getEntList() {
        return entList;
    }
    public void setEntList(ArrayList<Enterprise> entList) {
        this.entList = entList;
    }

    public EnterpriseDirectory(ArrayList<Enterprise> entList) {
        this.entList = entList;
    }
    
    public EnterpriseDirectory(){
        entList = new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.DoctorEnterprise){
            enterprise=new DoctorEnterprise(name);
            entList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.FinanceEnterprise){
            enterprise=new FinanceEnterprise(name);
            entList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.TestingEnterprise){
            enterprise=new TestingEnterprise(name);
            entList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.GOVTEnterprise){
            enterprise=new GOVTEnterprise(name);
            entList.add(enterprise);
        }
        return enterprise;
    }
    
}
