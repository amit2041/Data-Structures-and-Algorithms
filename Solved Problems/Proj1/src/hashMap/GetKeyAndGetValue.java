package hashMap;
import java.util.*;
public class GetKeyAndGetValue {

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
		
		System.out.println(map.get("China"));
		
		System.out.println(map.get("Indonesia"));

	}

}
