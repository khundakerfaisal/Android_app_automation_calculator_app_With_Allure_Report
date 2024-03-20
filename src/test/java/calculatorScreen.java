import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calculatorScreen {
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    WebElement btn1;

//    @FindBy(id = "com.google.android.calculator:id/digit_2")
//    WebElement btn2;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDivide;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMultiply;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnMinus;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;
    AndroidDriver driver;
    public calculatorScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String calculateSeries(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        btnDivide.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+e)).click();
        btnMultiply.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+f)).click();
        btnMinus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+g)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+h)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+i)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+j)).click();
        btnEqual.click();
        return txtResult.getText();
    }
}
