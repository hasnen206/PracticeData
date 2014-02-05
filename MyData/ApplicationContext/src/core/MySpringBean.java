package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySpringBean {

	private IWriter writer;

	public IWriter getWriter() {
		return writer;
	}

	@Autowired
	public void setWriter(IWriter writer) {
		this.writer = writer;
	}
public void run(){
	writer.writer("Hello Writer");
}
}
