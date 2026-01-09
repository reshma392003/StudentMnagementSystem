package com.sms;
import java.util.*;
public class StudentManagementApp {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         Admin  admin=new Admin("Reshma");
         ArrayList<Student> studentList = new ArrayList<Student>(); 
         while(true) {
        	 admin.showMenu();
        	 System.out.println("Enter your  choice:");
        	 int Choice=s.nextInt();
        	 s.nextLine();
        	 
        	 switch(Choice){
   
        		 case 1:
        			 System.out.println("Enter student ID:");
        			 int id=s.nextInt();
        			 s.nextLine();
        			 System.out.println("Enter student Name:");
        			 String name=s.nextLine();
        			 System.out.println("Enter student Marks:");
        			 int  marks= s.nextInt();
                     studentList.add(new Student(id,name,marks));
                     System.out.println("Student Added successfully");
        			 break;
        			 
        		 case 2:
        			 if(studentList.isEmpty()) {
        				 System.out.println("No Student Found");
        				 }else {
        					 for(Student st:studentList)
        						 st.display();
        			 }
        			 break;
        			 
        		 case 3:
        			 System.out.println("entse student ID  to update");
        			 int searchId = s.nextInt();
        			 boolean found=false;
        			 for(Student st:studentList) {
        				 if(st.getId() == searchId) {
        				System.out.println("Enter new marks");
        				int newMarks =s.nextInt();
        				st.setmarks(newMarks);
        				System.out.println("Marks updated");
        				found = true;
        				break;
        				 }
        			 }
        			 if(!found) {
        				 System.out.println("Student not fount..");
        			 }
        			 
        			 break;
        			 
        		 case 4:
        			 System.out.println("Exit Successfully...");
        			 System.exit(0);
        		default:
        			System.out.println("invalid choice");
        	 }
         }
	}

}
