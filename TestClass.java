package LabSys;

import java.util.ArrayList;

public class TestClass {
    public static ArrayList<Professor> teachersList = new ArrayList<>();
   
    public static void create()
    {

    	Professor teacher1 = new Professor("teacher1@university.com", "Teacher 1","1", "password");
    	Professor teacher2 = new Professor("teacher2@university.com", "Teacher 2","1", "password");

        teachersList.add(teacher1);
        teachersList.add(teacher2);

       
    }
}