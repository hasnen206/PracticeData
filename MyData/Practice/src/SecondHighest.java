
public class SecondHighest {

	private static final Exception ArithmeticException = null;

	public static void main(String args[]){
		int i=1;
		try {
			if(i>=1){
				throw ArithmeticException;
			}
			if(i==1){
				System.out.println("Arithmentic Exception1");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("Hello");
		}
		System.out.println("Done");
	}
}
