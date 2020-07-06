import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@DisplayName("Calculatrice")     
class CalculatriceSimpleTest {
    @DisplayName("Addition") 
	@Test
	public void testaddition() {
		
		CalculatriceSimple calculatrice = new CalculatriceSimple();
		//expected = attendu
		//actual = obtenu
		//assertEquals
		int attendu = 7;
		int obtenu = calculatrice.addition(6,1 );
		assertEquals(attendu,obtenu);
		
	}
	
	@DisplayName("Division")
	@Test
	public void testdivision() {
		CalculatriceSimple calculatrice = new CalculatriceSimple();
		//double attendu = 2;
		//double obtenu = calculatrice.division(6, 3);
		assertThrows(ArithmeticException.class, ()-> calculatrice.division(1, 0));

		
	}
	
	
	
	//assertall
    @DisplayName("Multiplication")
	@Test
	public void testmultiplication() {
		CalculatriceSimple  calculatrice = new CalculatriceSimple();
		assertAll(()->assertEquals(6,calculatrice.multiplication(2, 3)),
				  ()->assertEquals(0,calculatrice.multiplication(0, 1)),
				  ()->assertEquals(-4,calculatrice.multiplication(-1, 4))
	
				);
		
	}
	//repeatedtest
    @DisplayName("Sustraction")
    @RepeatedTest(30)
    //@Test
    public void testsustractiion() {
    	CalculatriceSimple  calculatrice = new CalculatriceSimple();
    	int attendu = 18;
    	int obtenu = calculatrice.sustraction(18, 0);
    	assertEquals(attendu, obtenu);
    }
	//enable et disabled
	@EnabledOnOs(OS.WINDOWS)
	@EnabledOnJre(JRE.JAVA_8)
	@DisplayName("surface de cercle ")
	@Test
	public void testsurfacedecercle() {
		CalculatriceSimple  calculatrice = new CalculatriceSimple();
		//System.out.print(calculatrice.cercle(4));
		double attendu = 12.566370614359172;
		double obtenu = calculatrice.cercle(4);
		assertEquals(attendu,obtenu);
	}
	@Test
	public void testtest1() {
		
		int a = 1;
		int b =1 ; 
		assertEquals(a,b);
	}

	@Disabled
	@Test
	public void testtest2() {
		
		int a = 1;
		int b =1 ; 
		assertEquals(a,b);
	}
}




//nested
@Nested
class nested{
	
	@Test
	public void nested1() {
		
		int a = 1;
		int b =1 ; 
		assertEquals(a,b);
	}
	
	@Test
	public void nested2() {
		
		int a = 1;
		int b =1 ; 
		assertEquals(a,b);
	}
	//assum
	@Test
	public void nested3() {
		boolean assum = true;
		assumeTrue(assum);
		int a = 1;
		int b =1 ; 
		assertEquals(a,b);
	}
	
	
}