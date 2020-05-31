package test;
import static org.junit.Assert.*;
import org.junit.Test;
import lab7.MyFraction;
public class MyFractionTester {
	  @Test
	public void testMyFractionStringIntInt() {
		String testString1 = "-";
		int y = 1;
		int z= 2;
		MyFraction  p = new MyFraction(testString1,y,z);
		assertNotNull(p);
	}
	@Test
	public void testGetNumerator() {
		String testString1 = "-";
		int y = 1;
		int z= 2;
		MyFraction  p = new MyFraction(testString1,y,z);
		assertEquals(y, p.getNumerator());
	}
	@Test
	public void testGetDenominator() {
		String testString1 = "-";
		int y = 1;
		int z= 2;
		MyFraction  q = new MyFraction(testString1,y,z);
		assertEquals(2,q.getDenominator());
	}
	@Test
	public void testGetSign() {
		String testString1 = "-";
		int y = 1;
		int z= 2;
		MyFraction  q = new MyFraction(testString1,y,z);
		assertEquals("-",q.getSign());
	}
	@Test
	public void testToString() {
		String o = "-";
		int y= 1;
		int z= 2;
		MyFraction i = new MyFraction(o,y,z);
		assertEquals("-1/2",i.toString());
	}
	@Test
	public void testAdd() {
		String o = "-";
		int y= 3;
		int z= 9;
		MyFraction u = new MyFraction(o,y,z);
		int t= 1;
		int f= 4;
		MyFraction v = new MyFraction(o,t,f);
		MyFraction r = new MyFraction("-",21,36);
		MyFraction w = u.add(v);
		assertEquals(r.toString(),w.toString());
	}
	@Test
	public void testSubtract() {
		String o = "-";
		int y= 3;
		int z= 9;
		MyFraction u = new MyFraction(o,y,z);
		int t= 1;
		int f= 4;
		MyFraction v = new MyFraction(o,t,f);
		MyFraction r = new MyFraction("-",3,36);
		MyFraction w = u.subtract(v);
		assertEquals(r.toString(),w.toString());
	}
	@Test
	public void testMultiply() {
		String o = "-";
		int y= 3;
		int z= 9;
		MyFraction u = new MyFraction(o,y,z);
		int t= 1;
		int f= 4;
		MyFraction v = new MyFraction(o,t,f);
		MyFraction r = new MyFraction("",3,36);
		MyFraction w = u.multiply(v);
		assertEquals(r.toString(),w.toString());
	}
	@Test
	public void testDivide() {
		String o = "-";
		int y= 3;
		int z= 9;
		MyFraction u = new MyFraction(o,y,z);
		int t= 1;
		int f= 4;
		MyFraction v = new MyFraction(o,t,f);
		MyFraction r = new MyFraction("",12,9);
		MyFraction w = u.divide(v);
		assertEquals(r.toString(),w.toString());
	}
	@Test
	public void testSimplify() {
		MyFraction r = new MyFraction("-",21,36);
		MyFraction v= r.simplify();
			assertEquals("-7/12",v.toString());
	}
}
