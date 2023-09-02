package listeners;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner_class 
{
@Test
public void test1()
{
	System.out.println("its me lion");
}
@Test
public void test2()
{
	System.out.println("its me tiger");
	Assert.fail();
}
@Test(dependsOnMethods = "test2")
public void test3()
{
	System.out.println("its me elephant");
}

}
