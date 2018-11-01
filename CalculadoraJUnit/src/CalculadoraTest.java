import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calc;
	
	@Before
	
	public void before() {
		System.out.println("Before");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		calc.clear();	
		System.out.println("after");
	}
	
	@Test
	public void testSuma() {
		
		calc.add(2,3);
		int resultado = calc.ans();
		int esperado = 5;
		assertEquals(esperado, resultado);
		System.out.println("sum" + resultado);
	}

	@Test
	public void testResta() {
		calc.sub(3,2);
		int resultado = calc.ans();
		int esperado = 1;
		assertEquals(esperado, resultado);
		System.out.println("rest" + resultado);
	}
	
	
	
}
