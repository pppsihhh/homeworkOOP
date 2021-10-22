package sample;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("Sergey", "Boyko", 35, Sex.MAN, 345678, "Math");
		Student st2 = new Student("Nadia", "Serebriakova", 32, Sex.WOMAN, 225467, "English");
		Student st3 = new Student("Anton", "Karpov", 33, Sex.MAN, 325780, "History");
		Student st4 = new Student("Pasha", "Novikov", 37, Sex.MAN, 325340, "Math");
		Student st5 = new Student("Viktoriia", "Vest", 23, Sex.WOMAN, 315780, "History");
		Student st6 = new Student("Elena", "Skala", 29, Sex.WOMAN, 325765, "English");
		Student st7 = new Student("Artem", "Senko", 30, Sex.MAN, 329870, "Math");
		Student st8 = new Student("Maksim", "Bykov", 25, Sex.MAN, 309780, "Math");
		Student st9 = new Student("Sveta", "Avik", 37, Sex.WOMAN, 325799, "English");
//		Student st10 = new Student("Boris", "Volkov", 20, Sex.MAN, 925430, "Sport");
//		Student st11 = new Student("Pavlik", "Chaus", 40, Sex.MAN, 815790, "Math");
		StudentGroup sg1 = new StudentGroup();
		sg1.setGroupName("Programmer");

		try {
			sg1.addStudent(st1);
			sg1.addStudent(st2);
			sg1.addStudent(st3);
			sg1.addStudent(st3);
			sg1.addStudent(st4);
			sg1.addStudent(st5);
			sg1.addStudent(st6);
			sg1.addStudent(st7);
			sg1.addStudent(st8);
			sg1.addStudent(st9);
//			sg1.addStudent(st10);

		} catch (NoFreePlaseException e) {
			System.out.println("there are no free places in the group");
		}

//		Student st12 = new CreateNewUserStudent().newStudent();
//		CreateNewUserStudent.addStudentToGroup(st12, sg1);		
//		System.out.println(sg1);

//		System.out.println(st3.toCSVString());
//		String a = "Andrey;Ivanov;27;MAN;325759;Math";
//		Student st13 = new Student().fromCSVString(a);
//		System.out.println(st13);

//		GroupFileStorage.saveGroupToCSV(sg1);
//
//		File f3 = new File("");
//		StudentGroup sg2 = new StudentGroup();
//		boolean ch = true;
//		try {
//			f3 = GroupFileStorage.findFileByGroupName("Programmer", new File("Group of student"));
//		} catch (NoSuchElementException e) {
//			ch = false;
//			System.out.println("Файл не найден");
//		}
//		if (ch) {
//			sg2 = GroupFileStorage.loadGroupFromCSV(f3);
//			System.out.println(sg2);
//		}

		Human h1 = new Human("Petro", "Mazur", 45, Sex.MAN);
		Human h2 = new Human("Petro", "Mazur", 45, Sex.MAN);
		Human h3 = new Human("Petro", "Mazur", 45, Sex.MAN);

		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h1.equals(h1));
		System.out.println(h1.equals(h2)+" => "+h2.equals(h1));
		System.out.println(h1.equals(h2)+" & "+h2.equals(h3)+" => "+h1.equals(h3));
		System.out.println("--------------------------");
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1.equals(st2));
	

	}
}
