package ArrayList;
import java.util.ArrayList;
public class PrintWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Apple");
		arr.add("Mango");
		arr.add("Banana");
		arr.add("Graps");
		arr.add("Orange");
		
		for(int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));	
		}

	}

}
