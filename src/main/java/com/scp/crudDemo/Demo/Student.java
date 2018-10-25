package com.scp.crudDemo.Demo;

import com.sun.istack.NotNull;

public class Student {
	
	private int roll_number;

	private String stud_Name;
	private String Stud_Address;
	
	private int stud_Marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll_number, String stud_Name, String stud_Address, int stud_Marks) {
		super();
		this.roll_number = roll_number;
		this.stud_Name = stud_Name;
		Stud_Address = stud_Address;
		this.stud_Marks = stud_Marks;
	}
	
		public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getStud_Name() {
		return stud_Name;
	}
	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}
	public String getStud_Address() {
		return Stud_Address;
	}
	public void setStud_Address(String stud_Address) {
		Stud_Address = stud_Address;
	}
	public int getStud_Marks() {
		return stud_Marks;
	}
	public void setStud_Marks(int stud_Marks) {
		this.stud_Marks = stud_Marks;
	}
		public String toString() {
		return "Roll_Number\t"+roll_number+"\tStudent Name\t"+stud_Name+"\tStudent Marks\t"+stud_Marks+"\tStudent Address\t"+Stud_Address;
	}
	
}
