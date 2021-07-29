/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory = new UserAccountDirectory();
    private EmployeeDirectory employeeDirectory = new EmployeeDirectory();
    private Type type;
    public ArrayList<Role> roles;
  
    public Organization(String name) {
        this.name = name;
        this.workQueue = workQueue;
        this.userAccountDirectory = userAccountDirectory;
        this.employeeDirectory = employeeDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        if(employeeDirectory == null){
            employeeDirectory = new EmployeeDirectory();
        }
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
   public abstract ArrayList<Role> getSupportedRole();
   
    public enum Type{
        Admin("Admin Organization"),
        PrimaryCareProvider("PrimaryCareProvider Organization"),
        Doctor("Doctor Organization"),
        LabReport("Lab Reporting Organization"),
        BackgroundCheck("Background Check Organisation"),
        Ration("Ration Organization"),
        Volunteer("Volunteer Organization"),
        MentalWellnessOverview("Mental Wellness Organization"),
        Facilitator("Counselling Facilitator Organization"),
        Counselling("Counselling Organization"),
        HealthMinistry("Ministry of Health Organization"),
        Coordinator("Coordinator Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        } 
    }
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        if(userAccountDirectory == null){
        userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
  
    
}
