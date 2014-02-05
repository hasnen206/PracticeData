package core;

public class ProgrammerImpl implements Programmer {

	private String name;
	private int age;
	private float height;
	private boolean isProgrammer;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public boolean isProgrammer() {
		return isProgrammer;
	}


	public void setIsProgrammer(boolean isProgrammer) {
		this.isProgrammer = isProgrammer;
	}


	@Override
	public void show() {
		System.out.println("Name: "+getName()+" Age: "+getAge()+" Height: "+getHeight()+" isProgrammer: "+isProgrammer());

	}

}
