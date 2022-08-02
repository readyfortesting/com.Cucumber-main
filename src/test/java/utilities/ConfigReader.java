package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // 1) Properties  objesi oluşturacağız

    static Properties properties;
    // 2) Bu class'ın amacı configuration.properties dosyasını okumak
    // ve key value 2lilerini kullanarak istediğiniz key'e ait value bize getirmek

    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 3) test classlarından config reader clasına ulaşıp yukarıdaki işlemleri
    // yapmamızı sağlayacak bir metod oluşturacağız

    public static String getProperty(String key){
        String value = properties.getProperty(key);
        return value;

    }
}