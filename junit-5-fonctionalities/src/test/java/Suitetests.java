import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

	/*L'annotation @RunWith avec le moteur Suite.class permet d'encha�ner plusieurs
    tests choisis dans un ordre donn�. L'exemple qui suit encha�ne les tests des classes de
    test CalculatriceSimpleTest et nested apr�s que les tests de Suitetests aient �t� ex�cut�s.
    Il est m�me possible d'ajouter une suite de tests dans une autre suite de tests*/
	@RunWith(Suite.class)
	@IncludeCategory(FastTest.class)
    @Suite.SuiteClasses({CalculatriceSimpleTest.class , nested.class})
	public  class Suitetests {
		
		
		
		}
    	
	
	
	
	
	
	
	
	
    

