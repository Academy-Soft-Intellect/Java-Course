import static org.junit.Assert.*;

public class TestAcademy  {

	@org.junit.Test
	public void testMultiply1() {
		int m1 = 5;
		int m2 = 12;
		Academy currentAcademy = new Academy();
		assertEquals("Result", m1 * m2, currentAcademy.multiply(m1, m2));
		
	}
	
	@org.junit.Test
	public void testJava() {
		Academy currentAcademy = new Academy();
		boolean result = currentAcademy.IsJavaPowerful();
		assertTrue(result);
		
	}

}
