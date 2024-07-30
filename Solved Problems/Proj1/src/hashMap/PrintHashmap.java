package hashMap;
import java.util.HashMap;
import java.util.Set;
public class PrintHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("abc", 1);
		map.put("def", 3);
		Set<String> keys = map.keySet();
		for(String s: keys) {
		//	System.out.println(s);
			System.out.println(s+" "+ map.get(s));
		}
	}

}
