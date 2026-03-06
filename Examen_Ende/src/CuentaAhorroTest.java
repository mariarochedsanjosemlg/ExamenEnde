import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuentaAhorroTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCuentaAhorro() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalcularInteres() {
		fail("Not yet implemented");
	}

}import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

	public static CuentaAhorro miCuentaAhorro;
public class CuentaCorrienteTest {

	@BeforeClass
	public static void setUpBeforeClass(){
	
	}

	@AfterClass
	public static void tearDownAfterClass(){
	}

	@Before
	public void setUp() {
		miCuentaAhorro = new CuentaAhorro("Pablo López", 1003, 0.5);
	 	System.out.println("Continuamos con otra prueba, creamos un objeto al iniciar la clase");
	}

	@After
	public void tearDown() {
		miCuentaAhorro = null;
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

