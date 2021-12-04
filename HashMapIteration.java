import java.util.*;

public class HashMapIteration {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"syamala");
		map.put(2,"priya");
		map.put(3, "jessy");
		map.put(4, "Meghana");
		map.put(5, "uma");
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println("key:" +entry.getKey());
			System.out.println("value:" +entry.getValue());

		}

	}

}