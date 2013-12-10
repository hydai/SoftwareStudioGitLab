public class Teacher {
	private String name = "HC";
	private String[] courses = {"Software Studio", "HCI Research Method"};
	
	public getName() {
		return this.name;
	}

	public getCourses() {
		return this.courses;
	}

	public printInfo() {
		System.out.println(this.name);
		System.out.println(this.courses);
	}
}
