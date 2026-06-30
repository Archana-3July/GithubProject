package utilitiges;

import jdk.jshell.spi.ExecutionControl;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties properties;
    String path="C:\\Users\\Archana Satpute\\IdeaProjects\\MyProject\\src\\configurator\\config.property";

    private Object value2;

    public ReadConfig(){
        try {
        properties = new Properties();
        //File propFile = new File(System.getProperty("user.dir" + "\\src\\configurator\\config.properties"));

            FileInputStream fls = new FileInputStream(path);
            properties.load(fls);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBaseUrl(){
        String value=properties.getProperty("url");
       if(value!=null)
            return value;
       else
            throw new RuntimeException("url not specified in config file");

    }

    public String getBaseBrowser() {
        String value= properties.getProperty("browserName");
        if(value!=null)
            return value;
        else
            throw new RuntimeException("Browser not specified in config file");
    }

    public String getFirstName(){
        String value= properties.getProperty("firstName");
        if(value!=null)
            return value;
        else
            throw new RuntimeException("First name not specified in config file");
    }
    public String getLastName(){
        String value= properties.getProperty("lastName");
        if(value!=null)
            return value;
        else
            throw new RuntimeException("Last name not specified in config file");
    }
    public String getPostCode(){
        String value= properties.getProperty("postCode");
        if(value!=null)
            return value;
        else
            throw new RuntimeException("Post Code not specified in config file");
    }

    public String getCustomerName(){
        String value= properties.getProperty("customerName");
        if(value!=null)
            return value;
        else
            throw new RuntimeException("Customer Name not specified in config file");
    }
    public String getCurrency(){
        String value= properties.getProperty("currency");
        if(value!=null)
            return value;
        else
            throw new RuntimeException("Currency not specified in config file");
    }
}
