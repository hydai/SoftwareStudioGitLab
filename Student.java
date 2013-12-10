public class Student {
	private String name = "Hung-ying Tai";
	private String studentID = "101062124";
	
	public String getName() {
		return this.name;
	}

	public String getStudentID() {
		return this.studentID;
	}

	public void printInfo() {
		System.out.println(this.studentID);
		System.out.println(this.name);
	}
}
