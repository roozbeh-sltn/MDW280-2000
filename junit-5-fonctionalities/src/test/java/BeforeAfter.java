import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;






class BeforeAfter {
	
	CalculatriceSimple calculatrice;
	
	@BeforeEach
	public void ini() {
		 calculatrice = new CalculatriceSimple();	
		
	}
	
	@AfterEach
	public void ini2(){
		
		System.out.println("après ...........;");
	}

      
	
	@DisplayName("Division")
	@Test
	public void testdivision() {
		
		//double attendu = 2;
		//double obtenu = calculatrice.division(6, 3);
		assertThrows(ArithmeticException.class, ()-> calculatrice.division(1, 0));

		
	}
    @DisplayName("Multiplication")
	@Test
	public void testmultiplication() {
	
		assertAll(()->assertEquals(6,calculatrice.multiplication(2, 3)),
				  ()->assertEquals(0,calculatrice.multiplication(0, 1)),
				  ()->assertEquals(-4,calculatrice.multiplication(-1, 4))
	
				);
    }

}
