package bufferedclass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LineWriter {
	public static void main(String args[]){
		try{
			FileWriter fw = new FileWriter("File1.txt",true);
			BufferedWriter br=new BufferedWriter(fw);
			br.newLine();
			br.write("using BufferedWriter");

			br.flush();
			br.close();
			fw.close();

		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
