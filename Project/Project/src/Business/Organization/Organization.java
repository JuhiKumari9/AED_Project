/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Employee.EmployeeDirectory;
import Business.ExpertTherapist.ExpertTherapistDirectory;
import Business.GeneralTherapist.GeneralTherapistDirectory;
import Business.OnlineReceptionist.OnlineReceptionistDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.RequestDirectory;
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
    private RequestDirectory requestDirectory = new RequestDirectory();
    private GeneralTherapistDirectory generalTherapistDirectory;
    private ExpertTherapistDirectory expertTherapistDirectory;
    private OnlineReceptionistDirectory onlineReceptionistDirectory;
  
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
        Coordinator("Coordinator Organization"),
        OnlineReceptionistOrganization("Online Receptionist"),
        ExpertTherapistOrganization("Expert Therapist"),
        GeneralTherapistOrganization("General Therapist"),
        Depression("Depression"),
        Anxiety("Anxiety"),
        YouthMentalHealth("Youth Mental Health"),
        PTSD("PTSD");
        
        
        
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

    public RequestDirectory getRequestDirectory() {
        if(requestDirectory == null){
        requestDirectory = new RequestDirectory();
        }
        return requestDirectory;
    }

    public GeneralTherapistDirectory getGeneralTherapistDirectory() {
        if(generalTherapistDirectory == null){
            generalTherapistDirectory = new GeneralTherapistDirectory();
        }
        return generalTherapistDirectory;
    }

    public void setGeneralTherapistDirectory(GeneralTherapistDirectory generalTherapistDirectory) {
        this.generalTherapistDirectory = generalTherapistDirectory;
    }

    public ExpertTherapistDirectory getExpertTherapistDirectory() {
        if(expertTherapistDirectory == null){
            expertTherapistDirectory = new ExpertTherapistDirectory();
        }
        return expertTherapistDirectory;
    }

    public void setExpertTherapistDirectory(ExpertTherapistDirectory expertTherapistDirectory) {
        this.expertTherapistDirectory = expertTherapistDirectory;
    }

    public OnlineReceptionistDirectory getOnlineReceptionistDirectory() {
        if(onlineReceptionistDirectory == null){
            onlineReceptionistDirectory = new OnlineReceptionistDirectory();
        }
        return onlineReceptionistDirectory;
    }
    
   @Override
        public String toString(){
        return getName();
    }
    
}
