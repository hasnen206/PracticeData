package core;

public class SimpleMessageSource implements MessageSource {

	private String message;
	
	public SimpleMessageSource() {
		System.out.println("Called once");
	}
	@Override
	public String getMessage() {
		
		
		return this.message;
	}
	@Override
	public void setMessage(String message) {
		this.message=message;
	}

}
