package core;

import java.util.HashMap;
import java.util.Map;

public class DefaultEncyclo implements Encyclo {

	private Map<String,Long> m=new HashMap<String,Long>(); 
	
	public DefaultEncyclo() {
	m.put("A",100L);
	m.put("B",10L);
	}
	
	public Long findLong(String e) {
		
		return m.get(e);
	}

}
