package LabSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public abstract class Labworkerr {
    protected String Name;
    protected String Position;
    protected int id;
    protected String emailId;
    protected String password;
    protected String firstName;
    protected String lastName;

  
    Labworkerr() {
      
    }
    
    public String getEmailId() {
        return emailId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int get_id() {
    	return id;
    }
    
    public String getPosition() {
        return Position;
    }

    public String getName() {
        return Name;
    }

    protected void set_id(int id) {
    	this.id=id;
    }
    
    protected void setEmailId(String emailId) {
        this.emailId = emailId.trim();
    }
    
    protected void setPassword(String encrpytedPassword) { 
    	this.password = encrpytedPassword; 
    }

    protected void setName(String Name) {
        this.Name = Name;
    }

    protected void setPosition(String Position) {
        this.Position = Position;
    }

    public void Welcome() {
    	System.out.println("****** I'll Welcome U **********");
    }
    
    public void setFirstName(String firstName){ 
    	this.firstName = firstName.trim(); 
    }

    public void setLastName(String lastName){ 
    	this.lastName = lastName.trim();
    }
    
    public static Labworkerr signUp(String firstName, String lastName, String emailId, String password) throws EmptyFieldException {
        return null;
    }

    public static Labworkerr signIn(String emailId, String password)
    {
        return null;
    }

    public abstract void viewDetails();


}
