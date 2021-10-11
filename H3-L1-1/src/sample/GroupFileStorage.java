package sample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GroupFileStorage {

	public static void saveGroupToCSV(StudentGroup sg) {
		Student[] st = sg.getStudentArray();
		File folder = new File("Group of student");
		if (!(folder.exists())) {
			folder.mkdir();
		}
		File studentGroupFile = new File(folder, sg.getGroupName() + ".csv");

		try (PrintWriter os = new PrintWriter(studentGroupFile)) {
			for (Student student : st) {
				if (student != null) {
					os.println(student.toCSVString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static StudentGroup loadGroupFromCSV(File file) {
		StudentGroup sg = new StudentGroup();
		String[] ss = file.getName().split("\\.");
		String str = "";
		for (int i = 0; i < ss.length - 1; i++) {
			str += ss[i];
		}
		sg.setGroupName(str);
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				Student s = new Student().fromCSVString(sc.nextLine());
				try {
					sg.addStudent(s);
				} catch (NoFreePlaseException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sg;
	}

	public static File findFileByGroupName(String groupName, File file) throws NoSuchElementException {
		String fGroupName = groupName + ".csv";
		File[] files = file.listFiles();
		boolean ch = false;
		for (File file2 : files) {
			if (file2.isFile() && file2.getName().equals(fGroupName)) {
				ch = true;
			}
		}
		if (ch) {
			return new File(file.getAbsolutePath(), fGroupName);
		}
		throw new NoSuchElementException();
	}

}
