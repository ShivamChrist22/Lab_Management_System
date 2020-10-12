package Prabhu_Sir;


import java.util.*;
import java.lang.*;



class Studentt extends Labworkerr{
	//    CLASS MEMBERS 
	int rno;
	String name;
	int noOfSubjects;
	// ACCESS SPECIFIERS AKA PUBLIC I HAVE USED :):):):)
	public Studentt() {
		
	}
	//CONSTRUCTOR OVERLOADING !!!!!!!!!!!
	public Studentt(int rno,String name) {
		this.rno=rno;
		this.name=name;
	}
	
	//CONSTRUCTOR OVERLOADING !!!!!!!!!!!
	public Studentt(int rno,String name,int noOfSubjects) {
		this.rno=rno;
		this.name=name;
		this.noOfSubjects=noOfSubjects;
	}
	
	
//	void read() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Roll No. :");
//		rno=sc.nextInt();
//		System.out.println("Enter Name of a Student :");
//		name=sc.next();
//		//sc.close();
//	}
	
	//    MEMBER FUNCTIONS 
	void display() {
		System.out.println("\n########## DETAILS OF A "+name+"##########");
		System.out.println("Name :"+name);
		System.out.println("Roll/Seat Number :"+rno);
		System.out.println("No. of Subjects :"+ noOfSubjects);
	}
	
	//FUNCTION OVERLOADING !!!!!!!!!!!
	void display(String[] attendance) {
		System.out.println("\n########## DETAILS OF A "+name+"##########");
		System.out.println("Name :"+name);
		System.out.println("Roll/Seat Number :"+rno);
		System.out.println("No. of Subjects :"+ noOfSubjects);
		System.out.println("Attendace of 1st 10 days of a lab:\n");
		System.out.print("Dates------------------------>\n");
		for(int i=0;i<10;i++) {
			System.out.print(attendance[i]+"\t");
		}
		
	}
	@Override
	public void viewDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student Name: " + this.getName());
        System.out.println("Student Courses: ");
		
	}

}// CLASS END

