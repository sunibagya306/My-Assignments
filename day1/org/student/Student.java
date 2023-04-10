package org.student;

import org.departmaent.Department;

public class Student extends Department{
	
	
	public void studentName() {
		System.out.println("Suneetha");s
	}
	public void studentDept() {
		System.out.println("Non IT");
	}
	public void studentId() {
		System.out.println("242143");
	}

	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();


	}

}
