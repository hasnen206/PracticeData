package core;

import java.io.FileWriter;
import java.io.IOException;

public class DefaultMessageDestination implements MessageDestination {

	@Override
	public void write(String message) {
		System.out.println(message);
		try {
			FileWriter fr=new FileWriter("New.txt");
			fr.write(message);
			fr.flush();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setFileName(String FileName) {
		// TODO Auto-generated method stub
		
	}

}
