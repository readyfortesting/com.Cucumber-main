package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    //driver'i başka classlardan sadece Driver class ismi ile çağırabilmek içi STATiC yaptık
    // HENÜZ O DRİVER İLE İLGİLİ AYARLAR YAPMADIĞIM İÇİN BAŞKA CLASSLAR YANLIŞLIKLA KULLANMASIN DİYE PRİVATE YAPTIK
    // ERİŞİMİ PRİVATE YAPTIK (SADECE BU CLASSÎN KULLANIMINA AÇTIK=

    public static WebDriver getDriver(){
        //class ismi ile çağırmak için static yaptık

        if(driver==null) {
            //if'i bu method her çalıştırıldığında yeni bir driver oluştırmamması için kullanıyoruz.
            // if driver'i kontrol edecek. eğer bir değer atandıysa yeni driver oluşturmayacak

            switch (ConfigReader.getProperty("browser")) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver(){
        //class ismi ile çağırmak için static yaptık

        if(driver!=null){
            driver.close();
        }

        //burada yeniden null değeri atamamızın sebebi. bir sonraki bir dsonraki get driver metodu çağırdığımızda
        // yeni değer atayabilmek istememizdir.
        driver=null;
    }
}