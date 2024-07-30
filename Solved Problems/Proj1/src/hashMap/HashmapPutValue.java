package hashMap;
import java.util.HashMap;
public class HashmapPutValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("India", 140);
		map.put("China", 180);
		map.put("United State", 30);
		map.put("Nepal", 3);
		map.put("Pakistan", 23);
		map.put("Brazil", 21);
		
		System.out.println(map);
		
		map.put("United State", 32);
	}

}
