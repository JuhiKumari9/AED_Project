/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GeneralTherapist;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class GeneralTherapistDirectory {
    ArrayList<GeneralTherapist> generalTherapistList = new ArrayList<>();

    public ArrayList<GeneralTherapist> getGeneralTherapistList() {
        if(generalTherapistList == null){
        generalTherapistList = new ArrayList<>();
        }
        return generalTherapistList;
    }

    
    public void addGeneralTherapist(GeneralTherapist gt){
        generalTherapistList.add(gt);
    
    }
    
     public void removeGeneralTherapist(GeneralTherapist gt){
        generalTherapistList.remove(gt);
    
    }
    
}
