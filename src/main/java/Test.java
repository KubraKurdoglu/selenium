import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Test {
    public static void main(String[] args) {
       // System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(ops);

        driver.get("https://www.amazon.com");
    }
}
