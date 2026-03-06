import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

	public static CuentaCorriente miCuentaCorriente;
public class CuentaCorrienteTest {

	@BeforeClass
	public static void setUpBeforeClass(){
	
	}

	@AfterClass
	public static void tearDownAfterClass(){
	}

	@Before
	public void setUp() {
		miCuentaCorriente = new CuentaCorriente("Pablo López", 1003, 10);
	 	System.out.println("Continuamos con otra prueba, creamos un objeto al iniciar la clase");

	@After
	public void tearDown() {
		miCuentaCorriente = null;
	}
	}

	@Test
	public void testCuentaCorriente() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalcularInteres() {
		
		
	}

	@Ignore
	public void testFiscal() {
	}
		

}
