package sample;

import java.util.Scanner;

public class CreateNewUserStudent {
	Scanner sc = new Scanner(System.in);
	public Student newStudent() {
		Student st = new Student();
		System.out.println("Enter student name");
		st.setName(sc.nextLine());
		System.out.println("Enter student last name");
		st.setLastName(sc.nextLine());
		System.out.println("Enter student age");
		st.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter student sex (man or woman)");
		String s1 = sc.nextLine();
		if (s1.equals("man")) {
			st.setSex(Sex.MAN);
		} else if (s1.equals("woman")) {
			st.setSex(Sex.WOMAN);
		} else {
			System.out.println("wrong in");
		}
		System.out.println("Enter student id");
		st.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter student group");
		st.setGroup(sc.nextLine());
		return st;
	}
	
	public static void addStudentToGroup (Student s, StudentGroup sg) {
		
		try {
			sg.addStudent(s);
		} catch (NoFreePlaseException e) {
			System.out.println("Group is full, cant add");
		}
		
	}
	
	
	
}
