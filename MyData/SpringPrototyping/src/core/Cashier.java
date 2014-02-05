package core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.InitializingBean;

public class Cashier {

	private String name;
	private String path;
	BufferedWriter writer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@PostConstruct
	public void Called(){
		System.out.println("This was also called");
	}
	
	
	public void openFile(){
		File f=new File(path, name+".txt");
		try {
			writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void checkout(ShoppingCart sc) throws IOException{
		double total=0;
		for(Product pro:sc.getItems()){
			total+=pro.getPrice();
		}
		writer.write(new Date() +" = "+ total+"\n" );
		writer.flush();
	}
	

	public void closeFile() throws IOException{
		System.out.println("close Method called");
		writer.close();
	}
}
