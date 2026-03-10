package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		UnitTesting o1=new UnitTesting();
		int output_f=o1.square(4);
		
		//Test the op-
		assertEquals(17,output_f);
	}

}
