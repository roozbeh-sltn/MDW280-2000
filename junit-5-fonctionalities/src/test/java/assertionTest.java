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

	      //V�rifiez que deux objets sont �gaux
	      assertEquals(str1, str2);

	      //V�rifier qu'une condition est vraie
	      assertTrue (val1 < val2);

	      //V�rifier qu'une condition est fausse
	      assertFalse(val1 > val2);

	      //V�rifier qu'un objet n'est pas nul
	      assertNotNull(str1);

	      //V�rifier qu'un objet est  nul
	      assertNull(str3);

	      //V�rifiez si deux r�f�rences d'objet pointent vers le m�me objet
	      assertSame(str4,str5);

	      //V�rifiez si deux r�f�rences d'objet ne pointent pas vers le m�me objet
	      assertNotSame(str1,str3);

	     // V�rifiez si deux tableaux sont �gaux l'un � l'autre
	      assertArrayEquals(expectedArray, resultArray);
	   }
	}


