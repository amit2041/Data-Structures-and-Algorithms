package OOPS_1;

class Pen{ // property and class name start with Capital letter
	String color; //like- blue, black, red, green
	String type;  //like- gel, ball point, dot pen
	
public void write(){  //function or method and function name start with small letter
	System.out.println("Write Something");
}
public void printColor(){ //function or method
	System.out.println(this.color);
}
}
public class OOPS {  //main class

	public static void main(String[] args) {  //object
		// TODO Auto-generated method stub
		Pen pen1 = new Pen();
		pen1.color = "Blue";
		pen1.type = "Gel";
	//	pen1.write();
		Pen pen2 = new Pen();
		pen2.color = "Black";
		pen2.type = "Ballpoint";
		
		pen1.printColor();
		pen2.printColor();
	}

}
