import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		// Stores in pair, key -> value : Entry
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Keys are unique, value can be duplicate
		map.put(1, "BMW");
		map.put(6, "Audi");
		map.put(4, "Honda");
		map.put(2, "Yugo");
		
		String value1 = map.get(1);
		System.out.println(value1);

	}

}
