package core;

public class BasicImpl implements Basic {

	@Override
	public void getAfter() {
		System.out.println("This Method will have After Advice Below");

	}

	@Override
	public String getBefore(String s) {
		
		return s;
	}

	@Override
	public Long getAround() {
		
		return 20L;
	}

}
