package Generics;

public class Print2 {

	public static <T> void printArray(T arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= new Integer[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		printArray(arr);
		String arrS[] = new String[5];
		for(int i = 0; i<arrS.length; i++) {
			arrS[i] = "abc";
		}
		printArray(arrS);

	}

}
