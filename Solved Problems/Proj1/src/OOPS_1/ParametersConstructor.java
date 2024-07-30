package OOPS_1;

class Studentt{
	String name;
	int age;
	
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Studentt(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class ParametersConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt student1 = new Studentt("Aman", 21);
		student1.printInfo();

	}

}
