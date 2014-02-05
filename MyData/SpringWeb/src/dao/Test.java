package dao;

public class Test {

	
	public static void main(String[] args) {
		DAOImpl impl=new DAOImpl();
		System.out.println(impl.getUser("ABC","ABC"));

	}

}
