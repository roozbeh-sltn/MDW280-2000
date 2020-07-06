import org.junit.Test;

public class Exepcion {
	
	@Test(expected = ArithmeticException.class)
	 public void should_throw_exception_when_dividing_by_zero() {
	  CalculatriceSimple cal = new  CalculatriceSimple();
	  cal.division(1, 0);

}}
