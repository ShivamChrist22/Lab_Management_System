
package Prabhu_Sir;

import java.util.ArrayList;

public class Subjects {
    private String SubjectName;
    private ArrayList<Professor> professorInCharge;
    private double numOfHours;
   
    Subjects(String SubjectName, ArrayList<Teacher> teachersInCharge, double numOfHours) {
        this.setCourseName(SubjectName);
        this.setProfessorInCharge(professorInCharge);
        this.setNumOfHours(numOfHours);
    }

    public String getCourseName() {
        return SubjectName;
    }

    public ArrayList<Professor> getProfessorInCharge() {
        return professorInCharge;
    }

    public double getNumOfHours() {
        return numOfHours;
    }

   

    public void setCourseName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public void setProfessorInCharge(ArrayList<Professor> professorInCharge) {
        this.professorInCharge = professorInCharge;
    }

    public void setNumOfHours(double numOfHours) {
        this.numOfHours = numOfHours;
    }

  

    public void showCourseDetails() {
        System.out.println("\t*************");
        System.out.println("\tCourse: " + getCourseName());
        System.out.println("\tTeachers: ");
        for (Professor professor : getProfessorInCharge())
        {
            System.out.println("\t" + professor.getName());
        }
        System.out.println("\t Number of Hours: " + getNumOfHours());
       
    }
}
