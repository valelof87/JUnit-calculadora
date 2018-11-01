import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class Calculadoraparametro {
	
	@Parameters
	public static Iterable<Object[]> getData(){
		return Arrays.asList(new Object [][]{
			{3,2,5},{2,4,6}, {3,3,6}	
		});
	}
	
	
	private int a, b , exp;
	
	
	
	public Calculadoraparametro(int a, int b, int exp) {
		super();
		this.a = a;
		this.b = b;
		this.exp = exp;
	}



	@Test
	public void testAdd() {
		Calculadora cal = new Calculadora();
		int result = cal.add(a, b);
		assertEquals(exp, result);
	}

}
