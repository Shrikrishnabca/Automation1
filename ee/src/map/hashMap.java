package map;
import java.util.*;
public class hashMap {
	public static void main(String[] args) {
		HashMap<Integer,String>e =new HashMap<Integer, String>();
		e.put(1, "krish");
		e.put(2, "rama");
		e.put(3, "naga");
		e.put(4, "naga");
		System.out.println("view of an hash map");
		System.out.println(e);
		System.out.println("check whether empty or not");
		System.out.println(e.isEmpty());
		System.out.println("check size of hash map");
		System.out.println(e.size());
		System.out.println("check whether key contains are not");
		System.out.println(e.containsKey(2));
		System.out.println("check whether value is contains are not");
		System.out.println(e.containsValue("krish"));
		System.out.println("to get 2 key value");
		System.out.println(e.get(2));
		System.out.println("to get all keys");
		System.out.println(e.keySet());
		System.out.println("to get all values");
		System.out.println(e.values());
		System.out.println("to get all entry");
		System.out.println(e.entrySet());
		HashMap<Integer, String> e2= new HashMap<Integer,String>();
		e2.putAll(e);
		Set s=e2.keySet();
		for(Object i:s)
		{
			System.out.println(i);
		}
		Collection c=e2.values();
		for(Object i:c)
		{
			System.out.println(i);
		}
		Set<Map.Entry<Integer, String>>m=e2.entrySet();
		for(Map.Entry<Integer, String> i:m)
		{
			System.out.println(i);
		}
		System.out.println("equal or not");
		System.out.println(e.equals(e2));
		e2.remove(2);
		for(Map.Entry<Integer, String> i:m)
		{
			System.out.println(i);
		}
		e2.clear();
		System.out.println(e2.isEmpty());
		}
}
