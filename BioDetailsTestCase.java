package ro.ase.alexandra;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BioDetailsTestCase {
	
	private Student student;
	private float[] grades= {10,5.3f,8.5f,9.7f,8.3f,9.2f};

	@Before
	public void setUp() throws Exception {		
		student=new Student("Alice McCarthney", 18,grades);
	}

	@Test
	public void testSetNameCorrect() {
		String expected="Diana Specer";
		student.setName(expected);
		assertSame(expected, student.getName());
	}
	

	@Test(expected = Exception.class)
	public void testSetAgeException() throws Exception {
		student.setAge(12);
	}

}
