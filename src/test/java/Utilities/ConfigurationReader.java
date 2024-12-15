package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    public static Properties prop; // NULL

    //Properties
    //FileInputStream -- opens connection to the file

    static {
        try{
            String filePath = "src/test/resources/configurationFolder/configuration.properties";  // file path
            FileInputStream fis = new FileInputStream(filePath);  // opens connection to the file

            prop = new Properties();  // instantiating the object from line 8
            prop.load(fis); // using the opened connection (fis), we load all the properties data, into prop
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static String getProperty(String keyName){
        return prop.getProperty(keyName);
    }



}