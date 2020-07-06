import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

public class BeforeAfterTous {
	
   //execute avant la class
   @BeforeClass
   public static void beforeClass() {
      System.out.println("in before class");
   }

   //execute après la class
   @AfterClass
   public static void  afterClass() {
      System.out.println("in after class");
   }

   //execute avant test
   @Before
   public void before() {
      System.out.println("in before");
   }
	
   //execute après test
   @After
   public void after() {
      System.out.println("in after");
   }
	
   //test case1
   @Test
   public void test1() {
      System.out.println("in test case 1");
   }
	
 //test case2
   @Test
   public void test2() {
      System.out.println("in test case 2");
   }
   
   
   //le cas de test ignore et ne s'exécute pas
   @Ignore
   public void ignoreTest() {
      System.out.println("in ignore test");
   }
}