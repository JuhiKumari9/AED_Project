/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OnlineReceptionist;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class OnlineReceptionistDirectory {
    ArrayList<OnlineReceptionist> onlineReceptionistList= new ArrayList<>();

    public ArrayList<OnlineReceptionist> getOnlineReceptionistList() {
        if(onlineReceptionistList == null){
            onlineReceptionistList = new ArrayList<>();
        }
        return onlineReceptionistList;
    }

    public void addOnlineReceptionist(OnlineReceptionist gt){
        onlineReceptionistList.add(gt);
    
    }
    
     public void removeOnlineReceptionist(OnlineReceptionist gt){
        onlineReceptionistList.remove(gt);
    
    }
    
    
    
}
