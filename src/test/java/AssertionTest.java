import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
@Test
        public void twonumber()

{
    int number1=3;
    int  number2=5;
    int sum = (number1+number2);
                /* next will be
                the print statements
                 */


        System.out.println("sum of two numbers+:"+sum);

        Assert.assertTrue(true);

}

//@Test
//public void equal()
//{
   // String actual = "login";
   // String expected = "LOGIN";

    //Assert.assertEquals(actual,expected,"Did not match the case");
    //Assert.fail("correct");

//}
}

