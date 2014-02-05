
public class StringReverse {

	
	public String getReverse(String word){
		
		char []a=new char[10];
		String rev=new String();
		a=word.toCharArray();
		
		for(int i=a.length-1,j=0;i>=0;i--,j++){
			System.out.println(a[i]);
			rev=rev + a[i];

		}
		return rev;
		
	}
	public static void main(String[] args) {
		StringReverse reverse=new StringReverse();

		
		String compare="nitin";
		String name=reverse.getReverse(compare);
		//System.out.println(name);
		if(name.equals(compare)){
			System.out.println("Perfect");
		}
		else{
			System.out.println("Try again");
		}

	}

}
