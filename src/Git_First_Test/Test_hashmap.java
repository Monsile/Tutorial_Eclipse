package Git_First_Test;

import java.util.HashMap;

public class Test_hashmap {

	public static void main(String[] args) {
		
		HashMap<Number, String> hm = new HashMap<Number, String>();
		
		hm.put(1, "Alex");
		hm.put(2, "Brown");
		hm.put(3, "Cristian");
		hm.put(4, "Drew");
		hm.put(5, "Evelyn");
		
		
		for(int i =0; i<hm.size(); i++) {
			
			System.out.println(hm.get(i+1));
		}
		
	}

}
