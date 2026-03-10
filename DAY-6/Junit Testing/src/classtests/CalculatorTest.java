package classtests;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CalculatorTest {
	
	static Calculator cal;
	
//	@BeforeAll
//	public static void init() {
//		cal = new Calculator();
//		System.out.println("Object Created");
//		
//	}
//	
//	@AfterAll
//	public static void destroy() {
//		cal = null;
//		System.out.println("Object Destroyed");
//		
//	}
	
	
	@Test
	public void square_test() {
		assertEquals(16,cal.square(4));
	}
	
	
	
	@Test
	public void sum_test() {
		
		assertEquals(9,cal.sum(5, 4));
	}
	
//	@ParameterizedTest
//	@CsvSource({"2,4,6","1,2,3"})
//	public void sum_test(int n1,int n2, int result) {
//		
//		assertEquals(result,cal.sum(n1, n2 ));
//	}

}
