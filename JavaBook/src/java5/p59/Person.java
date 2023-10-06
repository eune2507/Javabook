package java5.p59;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person arg0) {
		if (age < arg0.age) // < 와 > 화살표 방향에 따라 내림차순,오름차순
			return -1;
		else if (age == arg0.age)
			return 0;
		else
			return 1;
	}
}
