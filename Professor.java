package LabSys;

public class Professor extends Labworkerr {

    public Professor() {
        super();
    }

    public Professor(String emailId, String firstName, String lastName, String password) {
    	//this.set_id(id);
        this.setName(Name);
        this.setPosition(Position);
        this.setEmailId(emailId);
        this.setPassword(password);
    }
    
    public static Labworkerr signUp(String firstName, String lastName, String emailId, String password) throws EmptyFieldException {
        // Validate fields
        if (firstName.length()==0) {
            throw new EmptyFieldException("First name field is blank.");
        }
        else if (lastName.length()==0) {
            throw new EmptyFieldException("Last name field is blank.");
        }
        else if (emailId.length()==0) {
            throw new EmptyFieldException("Email Id field is blank.");
        }
        else if (password.length()==0) {
            throw new EmptyFieldException("Password field is blank.");
        }
        
        Professor professor = new Professor(emailId, firstName, lastName, password);
        return professor ;
    }
    
//    public static Labworkerr signIn(String emailId, String password)
//    {
//        // Fetch appropriate teacher from db matching email and password
//        for (Professor professor : Professor.getTeachersList()) {
//            if (professor.getEmailId().equals(emailId.trim()) && (password.trim().equals(professor.getPassword())))
//                return professor;
//        }
//
//        return null;
//    }
    
    public void viewDetails() {
    	System.out.println("********** Professor Details ***************** ");
        System.out.println("Professor Name: " + this.getName());
        System.out.println("Professor Position: " + this.getPosition());
        System.out.println("Professor Email: "+ this.getEmailId());
        System.out.println("Teacher Courses: ");
    }
}

