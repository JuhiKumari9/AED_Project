/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distributor;

import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class DistributorDirectory {
    ArrayList<Distributor> distributorList= new ArrayList<>();

    public ArrayList<Distributor> getDistributorList() {
        if(distributorList == null){
            distributorList = new ArrayList<>();
        }
        return distributorList;
    }

    public void addDistributor(Distributor gt){
        distributorList.add(gt);
    
    }
    
     public void removeDistributor(Distributor gt){
        distributorList.remove(gt);
    
    }
}
