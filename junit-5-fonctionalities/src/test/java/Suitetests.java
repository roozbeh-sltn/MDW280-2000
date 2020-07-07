import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

	/*L'annotation @RunWith avec le moteur Suite.class permet d'enchaîner plusieurs
    tests choisis dans un ordre donné. L'exemple qui suit enchaîne les tests des classes de
    test CalculatriceSimpleTest et nested après que les tests de Suitetests aient été exécutés.
    Il est même possible d'ajouter une suite de tests dans une autre suite de tests*/
	@RunWith(Suite.class)
	@IncludeCategory(FastTest.class)
    @Suite.SuiteClasses({CalculatriceSimpleTest.class , nested.class})
	public  class Suitetests {
		
		
		
		}
    	
	
	
	
	
	
	
	
	
    

