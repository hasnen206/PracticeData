import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	
	int a=0;
	int b=0;
	int i=0;
	int j=0;
	int sum=0;

    int []array1=new int[10];
    int []array2=new int[10];
	public int calculate(int a,int b){
		this.a=a;
		this.b=b;
		while(a>=1){
			a=a/2;
			array1[i]=a;
			System.out.println(array1[i]);
			i++;
		}
		while(j!=i){
			//System.out.println("Hello");
			b=b*2;
			array2[j]=b;
			System.out.println(array2[j]);
			j++;
		}
		
		for(int k=0;k<array1.length;k++){
			if((array1[k]%2)!=0){
				System.out.println("Hello");
				sum+=array2[k];
			}
		}
		return sum;
	
	}
	
	 public static void main(String[] args) throws IOException
	    {
	        //Test test=new Test();
	        //System.out.println(test.calculate(25, 7));
		
			 try {
				throw new IOException("Not Runnable");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 finally{
			 	try {
					throw new SQLDataException("SQL exception");
				} catch (SQLDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        }
	    }
	}