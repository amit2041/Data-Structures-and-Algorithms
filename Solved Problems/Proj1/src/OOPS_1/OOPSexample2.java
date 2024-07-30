package OOPS_1;

class Students{
	String name;
	int age;
	
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
public class OOPSexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student1 = new Students();
		Students student2 = new Students();
		Students student3 = new Students();
		student3.name = "Ramesh";
		student3.age = 21;
		student2.name = "Mohan";
		student1.name = "Kapil";
		student1.age = 25;
		student2.age = 28;
		student1.printInfo();
		student2.printInfo();
		student3.printInfo();

	}

}
