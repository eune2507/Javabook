package javatest;

import java.util.Scanner;

class Data {
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	String school = sc.next();
	int grade = sc.nextInt();
}

public class Main1 {
	public static void main(String[] args) {
		Data data = new Data();

		System.out.println("Name : " + data.name);
		System.out.println("School : " + data.school);
		System.out.println("Grade : " + data.grade);
	}
}
