package OOPS_1;

class Student{
	String name;
	int age;
	
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(){
		System.out.println("constructor called");
	}
}

public class NonParametersConstructions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.name = "Kapil";
		student1.age = 25;
		student1.printInfo();

	}

}
