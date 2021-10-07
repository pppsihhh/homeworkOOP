package sample;

import java.util.NoSuchElementException;

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
		Student st10 = new Student("Boris", "Volkov", 20, Sex.MAN, 925430, "Sport");
		Student st11 = new Student("Pavlik", "Chaus", 40, Sex.MAN, 815790, "Math");
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
			sg1.addStudent(st10);

		} catch (NoFreePlaseException e) {
			System.out.println("there are no free places in the group");
		}

		try {
			sg1.addStudent(st11);
		} catch (NoFreePlaseException e) {
			System.out.println("there are no free places in the group");
		}

		try {
			System.out.println(sg1.searchStudent("Fifi"));
		} catch (NoSuchElementException e) {
			System.out.println("Student not faund");
		}
		sg1.expulsionStudent(345678);
		sg1.expulsionStudent(225467);

		System.out.println(sg1);

		for (Student s : sg1.getStudentArray()) {
			if (s == null) {
				continue;
			}
			System.out.print(s.getLastName() + " ");
		}
		System.out.println("");

		sg1.sortStudentByLastName();

		for (Student s : sg1.getStudentArray()) {
			if (s == null) {
				continue;
			}
			System.out.print(s.getLastName() + " ");
		}
	}
}
