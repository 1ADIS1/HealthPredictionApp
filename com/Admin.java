package company.com;

import java.util.Map;

public class Admin {
    private static Admin instance;
    private final String correctPassword;
    private Database database;
    private Admin(String p){
        correctPassword = p;
    }
    public Admin getInstance(String password){
        if(instance == null){
            instance = new Admin(password);
            return instance;
        } else {
            if(password.equals(correctPassword)) return instance;
        }
        return null;
    }
    public List<User> viewUsers(){
        return null;
    }
    public List<Doctor> viewDoctors(){
        return null;
    }
    public void addDoctor(){
    }
    public Doctor manageDoctor(String name){
        return null;
    }
    public Set<> manageTrainingSet(){
        return null;
    }
    public Map<String, String> viewFeedback(){
        return null;
    }
}
