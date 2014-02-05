package core;

import java.util.Map;

public class DynamicEncyclo implements Encyclo {

	private Map<String,Long>m;
	
	public DynamicEncyclo(Map<String,Long>m1) {
			m=m1;
	}
	
	@Override
	public Long findLong(String e) {
		
		return m.get(e);
	}

}
