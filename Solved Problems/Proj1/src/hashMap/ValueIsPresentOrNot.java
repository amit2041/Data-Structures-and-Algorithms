package hashMap;

import java.util.HashMap;

public class ValueIsPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> map = new HashMap<>();
		
		map.put("India", 140);
		map.put("China", 180);
		map.put("United State", 30);
		map.put("Nepal", 3);
		map.put("Pakistan", 23);
		map.put("Brazil", 21);
		
		if(map.containsValue(32)) {
			System.out.println("Value is present in the map");
		}else {
			System.out.println("Value is not present in the map");
		}
	}

}
