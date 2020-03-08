import java.util.HashMap;


public class HashMapTest {

	public static void main(String[] args) {
		HashMap hm = new HashMap<String, String>();
		hm.put("One", "One");
		System.out.println(hm.get("One"));
		System.out.println(hm.get("two"));

	}

}
