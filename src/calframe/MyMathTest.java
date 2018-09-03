package calframe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import junit.framework.Assert;

//SX1716086 cjl
public class MyMathTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		double d = MyMath.add(10.0, 5.0);
		System.out.println(d);
		assertEquals(d,15.0,0.1);
	}

	@Test
	public void testSubtract() {
		double a = MyMath.subtract(10.0, 5.0);
		System.out.println(a);
		assertEquals(a,5.0,0.1);
	}

	@Test
	public void testMultiply() {
		double b = MyMath.multiply(10.0, 5.0);
		System.out.println(b);
		assertEquals(b,50.0,0.1);
	}

	@Test
	public void testDivide() {
		double c = MyMath.divide(10.0, 5.0);
		//System.out.println(c);
		assertEquals(c,1.0,0.1);
	}
}
