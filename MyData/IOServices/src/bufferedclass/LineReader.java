package bufferedclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineReader {
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader("File1.txt");
			BufferedReader br = new BufferedReader(fr);
		
			String s = br.readLine();
			
			while(s!= null){
				System.out.println(s);
				s = br.readLine();
			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
}
