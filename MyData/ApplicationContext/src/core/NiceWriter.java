package core;

import org.springframework.stereotype.Service;

@Service
public class NiceWriter implements IWriter {

	@Override
	public void writer(String s) {
		System.out.println("Final Writer s: "+s );

	}

}
