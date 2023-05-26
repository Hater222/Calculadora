import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest1 {
	
	@Test
	public void testSuma(){
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}
	
	@Test
	public void testResta(){
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}
	
	@Test
	public void testMultiplica(){
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.multiplica();
		assertEquals(200, resultado);
	}
	
	@Test 
	public void testDivision(){
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.division();
		assertEquals(2, resultado);
	}
}
	
