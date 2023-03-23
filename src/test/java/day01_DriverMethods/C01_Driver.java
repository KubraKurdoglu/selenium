package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Driver {
    public static void main(String[] args) {

        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        //chrome, safari, edge istedigin driver'i kullanabilirsin
        //ama resources kisminda, driver bolumune gerekli exe dosyasini eklemen gerkeiyor


        //System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
        //Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz


        System.out.println(System.getProperty("edgeDriver"));

        //bu yukardaki kodu "path" degerini (value) bulmak icin kullandi
        //getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim


        WebDriver driver = new EdgeDriver();//Boş bir browser açar
        driver.get("https://techproeducation.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz
        System.out.println("Sayfa Başlığı = "+driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir
        System.out.println("Sayfa Url'i = "+driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir
        //System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kaynak kodlarını verir
        //bu usteki kod cok kullqnilmayabilir dedi. yazdirma kismina cok uzun bir sey yazdiriyor diye o nedenle
        //yourma aldi

    }
}





