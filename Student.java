package com.sms;

public class Student {
   private int id;
   private String name;
   private int marks;
   public Student(int id, String name, int marks) {
	this.id = id;
	this.name = name;
	this.marks = marks;
   }
   public int getId() {
	 return id;  
   }
   public String getname() {
		return name;  
   }
   public int getmarks() {
		 return marks;  
 }
   public void setmarks(int marks) {
	   this.marks=marks;
   }
public String getGrade() {
	if(marks>=90) return"A+";
	else if(marks>=75) return"A";
	else if(marks>=60) return"B";
	else if(marks>=40) return"c";
	else return"F";
}
public void display() {
	System.out.println("ID:"+ id+", Name:"+ name+", Marks:"+ marks +", Grade:"+getGrade());
}

   
}