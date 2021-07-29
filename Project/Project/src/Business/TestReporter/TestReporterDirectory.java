/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestReporter;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class TestReporterDirectory {
    
    ArrayList<TestReporter> testReporterList = new ArrayList<>();

    public ArrayList<TestReporter> getTestReporterList() {
        if(testReporterList == null){
            testReporterList = new ArrayList<>();
        }
        return testReporterList;
    }
    
    public void addTestReporter(TestReporter testR){
        testReporterList.add(testR);
    }
    
    public void removeTestReporter(TestReporter testR){
        testReporterList.remove(testR);
    }
    
    
}
