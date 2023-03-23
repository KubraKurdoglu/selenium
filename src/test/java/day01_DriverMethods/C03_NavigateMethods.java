package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("edgeDriver","src/source/driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        // Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);// java kodlarini bekletmek icin kullanilir(3 sn bekletir)

        // Basligin techproeducatin sayfazina gidelim
        driver.navigate().to("https://www.techproeducation.com");//get()==> methodu ile ayni calisir

        // techproedu sayfa bslligini konsola yzdirallim
        System.out.println("sayfa basligi" + driver.getTitle());

        //tekrar Amazon sayfasina geri donelim
        driver.navigate().back();//onceki sayfaya donmek icin

        Thread.sleep(3000);// java kodlarini bekletmek icin kullanilir(3 sn bekletir)
        //Amazon sayfasinin baslligini yazdiralim
        System.out.println("sayfa basligi" + driver.getTitle());

        //Tekrar techpro sayfasina geri gidelim
        driver.navigate().forward();

        //Son olarak sayfayi yenileyelim ve sayfayi kapatalim
        driver.navigate().refresh();//sayfayi yeniler
        driver.close();//driver'i kapatir

        // Not: Sayfalar arasi gecisler hizli olacagindan 3 sn gecisler icin bekletelim

    }
}
