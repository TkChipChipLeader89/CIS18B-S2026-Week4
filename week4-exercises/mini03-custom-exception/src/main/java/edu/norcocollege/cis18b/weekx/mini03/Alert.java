package edu.norcocollege.cis18b.weekx.mini03;

public class Alert {
    //Variables for id, message, and level
    private int id;
    private String message;
    private AlertLevel level;
    
    //Constructor for Alert class
    public Alert(int id, String message, AlertLevel level) {
        this.id = id;
        this.message = message;
        this.level = level;
    }

    /*Created getters and setters for all variables */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public AlertLevel getLevel() {
        return level;
    }
    public void setLevel(AlertLevel level) {
        this.level = level;
    }
}
