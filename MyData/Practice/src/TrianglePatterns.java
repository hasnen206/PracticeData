
public class TrianglePatterns {

	
	public static void main(String[] args) {
		int x=11,y=x/2,z=1;
		
		for(int i=0;i<5;i++){
			
			for(int j=0;j<y;j++){
				
				System.out.print(" ");
				
			}
			for(int k=1;k<=z;k++){
				System.out.print(k);
				
			}
			y=y-1;
			z=z+2;
			System.out.println(" ");
		}

	}

}
