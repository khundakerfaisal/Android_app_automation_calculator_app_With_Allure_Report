import org.testng.Assert;
import org.testng.annotations.Test;

public class calculatorSeriesTestRunner extends setup{
    @Test(priority=1,description ="Calculate Series Number")
    public void doSeries(){
        calculatorScreen calculatorScreen=new calculatorScreen(driver);
        String value=calculatorScreen.calculateSeries(1,0,0,1,0,5,1,0,6,0);
        System.out.println(value);
        Assert.assertEquals(value,"100");

    }
}
