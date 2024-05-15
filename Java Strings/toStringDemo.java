package Strings;

public class toStringDemo {
	int age;
	String name;
	String city;
	int experience;

	toStringDemo(int age, String name, String city, int experience) {
		this.age = age;
		this.name = name;
		this.city = city;
		this.experience = experience;
	}

	public static void main(String[] args) {
		toStringDemo string = new toStringDemo(25, "Sarthak", "Indore", 1);
		toStringDemo string2 = new toStringDemo(25, "Ayush", "Indore", 2);
		System.out.println(string);
		System.out.println(string2);
	}

	public String toString() {
		return "[age=" + this.age + ", name=" + this.name + ", city=" + this.city + ", experience=" + this.experience
				+ "]";
	}
}