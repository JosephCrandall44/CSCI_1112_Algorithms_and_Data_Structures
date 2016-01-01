import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {
	static HashMap<String, Boolean> map = new HashMap<>();
	public static void main(String[] args)
	{
		map.put("Kenny", true);
		map.put("Joe", false);
		map.get("Kenny");
		
		System.out.println(map.get("Kenny"));
		
		if(map.containsKey("Jack")){
			System.out.println(1);
		}
		
		if(map.containsValue(Boolean.FALSE)){
			System.out.println(2);
		}
		
		for (String s: map.keySet()){
			System.out.println(3);
		}
		for(Boolean b: map.values()){
			System.out.println(4);
		}
		for (Map.Entry kv : map.entrySet()){
			
		}
		map.remove("Kenny");
		
	}

}
