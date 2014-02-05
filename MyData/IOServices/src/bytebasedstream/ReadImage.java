package bytebasedstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadImage {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("roses.jpg");
			FileOutputStream fos=new FileOutputStream("NewRoses.jpg");
			int i=fis.read();
			while(i!= -1){
				fos.write(i);
				i = fis.read();
			}
		}
		catch (FileNotFoundException e) { 
			e.printStackTrace(); 
		}
		catch(IOException e) { 
			e.printStackTrace(); 
		} 
	}
}
