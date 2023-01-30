package edu.sabanciuniv.IT524.srs;

public class GradStudent extends Student {
	private String thesisTopic;

	public GradStudent(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}

	public GradStudent(int id, String name, String lastname, String thesisTopic) {
		super(id,name,lastname);
		this.thesisTopic = thesisTopic;
	}	
	
	public void printInfo() {
		System.out.println("-----------");
		System.out.println("Student name: "+ this.getName());
		System.out.println("Student lastname: "+ this.getLastname());
		System.out.println("Student id: "+ this.getId());
		System.out.println("Student id: "+ this.getThesisTopic());
		System.out.println("-----------\n");
		
	}

	public String getThesisTopic() {
		return thesisTopic;
	}

	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
	
	
}
