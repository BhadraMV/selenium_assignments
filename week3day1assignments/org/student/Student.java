package org.student;

public class Student extends org.department.Department{

	public void studentName()
	{
		System.out.println("Student name is Bhadra");
	}
	public void studentDept()
	{
		Student s=new Student();
		 s.deptName();
	}
	public void studentID()
	{
		System.out.println("ID number:1233547");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.studentName();
		s1.studentDept();
		s1.studentID();
		s1.collegeName();
		s1.collegeCode();
		s1.collegeRank();
		
       
	}

}
