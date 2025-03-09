package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MyStepdefs {
    FirefoxDriver driver;

    @Given("I am in the login")
    @Given("I am in the login page")
    public void i_Am_In_The_Login_Page() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("admin");

        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        System.out.println(driver.getTitle());
    }


}
