package Prabhu_Sir;


import java.util.*;
import java.lang.*;

public class Lab_Management_System {
	//STATIC VARIABLES!!!!!!!!!!
	static String status="Domain Based Program ";
	
	//MULTIPLE STATIC BLOCKS!!!!!!!!!!!!! 
	//First static block
	  static{
	      System.out.println("\nStatic Block 1");
	      System.out.println("Static Block 1");
	      System.out.println(status);
	    
	  } 
	  //Second static block
	  static{
	      System.out.println("\nStatic Block 2");
	      System.out.println("Static Block 1");
	      System.out.println(status);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nSTUDENT HAVE TO LOGIN FIRST IN ORDER TO ACCESS YOUR 'KP'");
		
		int ch=0,i;
		
		//LOGIN CODE IS WRITTEN >>>>>>>>>>>>>>>>>>>>>>>
		String Password = "root";
		String Username = "Student";

		Scanner input1=new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = input1.next();

		Scanner input2=new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = input2.next();
		
		// CONTROL STATEMENTS 
		if(username.equals(Username)&& Password.equals(password)){
			System.out.println("\n#########   LOGIN SUCCESSFULL   ##########\n");
		}
		else if(!(Username.equals(username))){
			System.out.println("\nInvaild Username!");
		}
		else if(Password!=password){
			System.out.println("\nInvaild Password!");
		}
		else{
			System.out.println("\nInvalid Username & Password!");
		}
		
		Scanner sc=new Scanner(System.in);
		
        while (true) {
            System.out.println("***********************");
            System.out.println("Choose Sign Up option: ");
            System.out.println("1. As Teacher");
            System.out.println("2. As Student");
            System.out.println("***********************");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            // Garbage Collection for to clear input stream for future inputs
            String garbage = sc.nextLine();

            Labworkerr labworker;

            if (ch == 1)
            {
                labworker = new Professor();
            }
            else if (ch == 2)
            {
                labworker = new Studentt();
            }
            else {
                System.out.println("Bye.");
                break;
            }

        }

	}
}
