package datediff;

public class TestCases {

	
	public static void main(String[] args) {
		MyDate date1=new MyDate(1,4,2011);
		MyDate date2=new MyDate(19,5,2011);
		DataUtils ans=new DataUtils();
		double answer=ans.Calc(date1,date2);
		System.out.println(answer);
		
	}

}
