
public class MoreOnFunctionPrintEvenStartToEnd {
	public static void printEvenNumber(int start, int end) {
		if(start%2!=0){
			start++;
		}
		for(int i = start; i<=end; i+=2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		printEvenNumber(3, 17);

	}

}
