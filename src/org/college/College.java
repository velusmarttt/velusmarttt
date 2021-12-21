 package org.college;

public class College {
	public void collegeName() {
		System.out.println("srm university");
	}
	public void collegeCode() {
		System.out.println("em6235");
	}
}
	class Hostel extends College{
		public void hostelName() {
			System.out.println("swetha gents hostel");
		}
	}
	class Dept extends Hostel{
		public void deptName() {
			System.out.println("mechanical");
		}
	}
	class Student extends Dept{
		public void studentName() {
			System.out.println("vengat");
		}
	public void studentDept() {
		System.out.println("mechhh");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.collegeName();
		s.collegeCode();
		s.hostelName();
		s.deptName();	
	}
	}