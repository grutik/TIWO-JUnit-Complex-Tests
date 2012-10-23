package cplx;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexTest{

	private static double eps = 1e-12;

	@Test
	public void testComplexConstructorNoParams(){
		Complex cplx = new Complex();
		assertEquals("Pole Re nowego obiektu Complex wynosi 0",cplx.getRe(),0.0,eps);
		assertEquals("Pole Im nowego obiektu Complex wynosi 0",cplx.getIm(),0.0,eps);
	}

	@Test
	public void testComplexConstructorTwoParams(){
		Complex cplx = new Complex(1.0,2.0);
		assertEquals("Pole Re nowego obiektu Complex wynosi 1",cplx.getRe(),1.0,eps);
		assertEquals("Pole Im nowego obiektu Complex wynosi 2",cplx.getIm(),2.0,eps);
	}

	@Test
	public void testComplexConstructorOneParam(){
		Complex cplx = new Complex(1.0);
		
		assertEquals("Test Message 1",cplx.getRe(),1.0,eps);
		assertEquals("Test Message 2",cplx.getIm(),0.0,eps);
	}

	@Test
	public void testComplexAddStatic(){
		Complex c1 = new Complex(1.0,2.0);
		Complex c2 = new Complex(2.0,1.0);
		Complex c3 = Complex.add(c1,c2);
		
		assertEquals("Re obiektu c3 == 3.0",c3.getRe(),3.0,eps);
		assertEquals("Im obiektu c3 == 3.0",c3.getIm(),3.0,eps);
	}

	@Test
	public void testComplexAddDynamic(){
		Complex c1 = new Complex(1.0,2.0);
		Complex c2 = new Complex(2.0,1.0);
		c1.add(c2);
		
		assertEquals("Re obiektu c1 == 3.0",c1.getRe(),3.0,eps);
		assertEquals("Im obiektu c1 == 2.0",c1.getIm(),2.0,eps);
	}

}
