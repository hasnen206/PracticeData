package core;

import java.io.FileWriter;
import java.io.IOException;

public class FileDestination implements MessageDestination{
	
	String fileName;
	public void write(String message) {
		//System.out.println();
		try {
			FileWriter fr=new FileWriter(fileName);
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
		this.fileName=FileName;
		
	}

}
