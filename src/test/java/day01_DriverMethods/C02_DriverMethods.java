package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com");

        //Sayfa başlığını konsola yazdırınız
        System.out.println("Sayfa Başlığı : "+driver.getTitle());

        //Sayfanın Url'ini yazdırınız
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //Sonra techproeducation sayfasına gidiniz
        driver.get("https://techproeducation.com");

        //NOTE: burda navigate' de kullanilabilirdi ama yukardaki kodda ise yaradi

        //techproeducation'in sayfa baslığı ve url'ini yazdırınız
        System.out.println("Sayfa Başlığı : "+driver.getTitle());
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //Sayfanın windowHandle değerini yazdırınız
        System.out.println(driver.getWindowHandle());

        //windowhqndle'yi manuel olarakta alabiliriz;
        //iki sayfa arasinda gezindiginde, bir onceki sayfaya geri donmekk icin manuel olarak
        //geri tusuna basmamiz veya yukardaki sekmelerden bir onceki sayfaya tiklamamiz gerekiyordu
        //bunu otomasyonla yapmak icin "windowhandle" degerini kullaniyoruz
        // "windowhandle" degerini kullaniyoruz.

        //HANDLES==> ise windowhandle'den farkli, bunu ilerde gorecegiz, ama sanirim
        //herhangi bir sayfada iken bir baska sayfaya farkli sekilde gecmek icin


        //ISTERSEN TUM BU KODLARI CHROME ILE DE CALISTIRABILIRSIN
        //System.setProperty("chromeDriver","src/resources/driver/msedgedriver.exe" );
        // //WebDriver driver= new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origin=*"));
        // BU KODU YORUMDAN KALIDIRIP
        //EDGE YI YORUMA ALIRSAN OYLE CALISIR

    }
}