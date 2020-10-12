package Prabhu_Sir;


public class Professor extends Labworkerr {

    Professor() {
        super();
    }

    Professor(String Name, String Position) {
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

