import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertionTest {

	@Test
	public void testassertion() {
		//test data
	      String str1 = new String ("abc");
	      String str2 = new String ("abc");
	      String str3 = null;
	      String str4 = "abc";
	      String str5 = "abc";
			
	      int val1 = 5;
	      int val2 = 6;

	      String[] expectedArray = {"one", "two", "three"};
	      String[] resultArray =  {"one", "two", "three"};

	      //Vérifiez que deux objets sont égaux
	      assertEquals(str1, str2);

	      //Vérifier qu'une condition est vraie
	      assertTrue (val1 < val2);

	      //Vérifier qu'une condition est fausse
	      assertFalse(val1 > val2);

	      //Vérifier qu'un objet n'est pas nul
	      assertNotNull(str1);

	      //Vérifier qu'un objet est  nul
	      assertNull(str3);

	      //Vérifiez si deux références d'objet pointent vers le même objet
	      assertSame(str4,str5);

	      //Vérifiez si deux références d'objet ne pointent pas vers le même objet
	      assertNotSame(str1,str3);

	     // Vérifiez si deux tableaux sont égaux l'un à l'autre
	      assertArrayEquals(expectedArray, resultArray);
	   }
	}


