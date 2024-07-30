package ArrayList;

import java.util.ArrayList;

public class RemoveByInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 80);
		Integer i = 10;
		arr.remove(i);
		System.out.println(arr.size());
		System.out.println(arr.get(0));
	}

}
