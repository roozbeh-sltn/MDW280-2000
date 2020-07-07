import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCategory {
	@Test
    public void a() {
        System.out.println("a() method of class A has been run...\n");
    }
 
    @Category(FastTest.class)
    @Test
    public void b() {
        System.out.println("b() method of class A has been run...\n");
    }
}
