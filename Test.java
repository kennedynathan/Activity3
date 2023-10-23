package app;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Person[] persons = new Person[4];
		persons[0]= new Person("Justine", "Reha",20);
		persons[1] = new Person("Brianna", "Reha", 19);
		persons[2] = new Person("Mary", "Reha", 30);
		persons[3] = new Person("Mark", "Reha", 34);
		Arrays.sort(persons);
		for(int x=0;x < 4;++x) {
			System.out.println(persons[x]);
		}
	}

}
