/**
 * 
 */
package co.com.tdd.prueba1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Milton
 *
 */
public class PruebaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link co.com.tdd.prueba1.Prueba#sumar()}.
	 */
	@Test
	public final void testSumarNotNull() {
		Prueba prueba = new Prueba();
		assertNotNull(prueba.sumar(3, 5));
	}
	
	@Test
	public final void testSumarDosOperandos() {
		Prueba prueba = new Prueba();
		assertEquals(new Integer(2), prueba.sumar(1,1));
	}

}
