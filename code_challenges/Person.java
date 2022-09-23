package code_challenges;

public class Person {
	private String name;
	private String lastName;
	private int age;
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age < this.age)
			System.out.println("incorrect age");
		else this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Person(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	public void introduceYourSelf() {
		System.out.printf("My name is %s, my lastname is %s, my age is %d", this.name, this.lastName, this.age);
		System.out.println();
	}
}
