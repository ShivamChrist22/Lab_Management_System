package LabSys;

public class Professor extends Labworkerr extends Thread {

    public Professor() {
        super();
    }

    public Professor(String Name, String Position) {
        this.setName(Name);
        this.setPosition(Position);
    }

    public void viewDetails() {
    	System.out.println("********** Professor Details ***************** ");
        System.out.println("Professor Name: " + this.getName());
        System.out.println("Professor Position: " + this.getPosition());
        System.out.println("Teacher Courses: ");
    }
}

