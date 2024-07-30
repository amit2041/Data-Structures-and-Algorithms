package String;

public class StringVSstringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0, 'd');
		str.append("def");
		System.out.println(str + " "+ str.length());
	}

}
