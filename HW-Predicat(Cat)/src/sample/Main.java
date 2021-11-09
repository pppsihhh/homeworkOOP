package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat("Vaska", 10));
		catList.add(new Cat("Murka", 3));
		catList.add(new Cat("Keks", 5));
		catList.add(new Cat("Garfild", 7));
		catList.add(new Cat("Pushok", 6));
		catList.add(new Cat("Markiz", 4));
		
		System.out.println(catList);
		Predicate<Cat> pr1 = cat -> cat.catTest(10, 'G');
		catList.removeIf(pr1);
		System.out.println(catList);
		
	}

}
