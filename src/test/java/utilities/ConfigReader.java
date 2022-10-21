package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {   // her methoddan once calisir static blok

        String dosyaYolu = "configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            properties = new Properties();

            properties.load(fis);    // fis'in okudugu bilgileri properties'e yukledi

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {

        // test methodundan yolladigimiz string key degerini alip
        // properties class'indan getProperty methodunu kullanarak
        // bu key'e ait value'yu bize getirir

        return properties.getProperty(key);
    }
}
