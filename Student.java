

public class Student {
	private String name;
	private int age;
	private float[] grades;
	public Student(String name, int age, float[] grades) {
		super();
		this.name = name;
		this.age = age;
		this.grades = grades;
	}
	
	public float getAverage() {
		return this.getGradesSum()/this.grades.length;
	}
	
	public float getGradesSum() {
	float sum=0;
		for(int i=0;i<this.grades.length;i++) {
			sum+=this.grades[i];
		}
		
		return sum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws Exception {
		if(age<18) {
			throw new Exception("The student must be older than 14");
		}
		this.age = age;
	}
	
	public float[] getGrades() {
		return grades;
	}
	
	public void setGrades(float[] grades) {
		this.grades = grades;
	}
	
	
	
}
