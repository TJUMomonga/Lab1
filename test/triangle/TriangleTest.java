package triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTest {

	private int input1;
	private int input2;
	private int input3;
	private String expected;
	private Triangle triangle;
	
	public TriangleTest(String expected, int input1,int input2,int input3){
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		triangle = new Triangle();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
	return Arrays.asList(new Object[][]{
	{"isosceles",3,3,4},
	{"equilateral",3,3,3},
	{"Not a triangle",1,3,6},
	{"scalene",2,3,4}
	});
	}
	
	@Test
	public void testWhichTriangle() {
		assertEquals(this.expected,triangle.whichTriangle(input1, input2,input3));
	}
}
