package ro.ase.alexandra;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GradesTestCase {

	private Student student;
	private float[] grades= {10,9,8,9};

	@Before
	public void setUp() throws Exception {		
		student=new Student("Alice McCarthney", 18,grades);
	}

	@Test
	public void averageCorrect() {
		float averageExpected=9;
		assertEquals(averageExpected, student.getAverage(),0.00001);
	}

	@Test
	public void averageOrder() {
		float firstAverage=student.getAverage();
		float grades[]= {8,9,9,10};
		student.setGrades(grades);
		assertEquals(firstAverage, student.getAverage(),0.00001);
	}
}
