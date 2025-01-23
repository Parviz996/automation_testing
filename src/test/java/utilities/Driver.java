package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    /*
        Driver class'ındaki 'sas mentiq extends yöntemiyle deyil yeni ReusableMethods class'ına extent etmek yerine
    Driver class'ından static methodlar istifade ederek driver yaradiriq. Static olduğu ucun class adi ile
    her yerden method el catan olacaq
     */
    /*
    Singleton Pattern: Tekli kullanım kalıbı.
        Bir class'tan obje oluşturulmasının önüne geçilmesi için kullanılan ifade
        Bir class'tan obje oluşturmanın önüne geçmek için default constructor'ın kullanımını engellemek için
    private access modifire kullanarak bir constructor oluştururuz
     */
    private Driver(){

    }
    public static WebDriver driver;
    static DesiredCapabilities capabilities=new DesiredCapabilities();

    public static WebDriver getDriver() {
        /*
            Driver'i her çağırdığında yeni bir pencere açılmasının önüne keçmek ucun
        if bloku içinde Eger driver'a deyer verilmeyibse(driver doluysa) deyer ver, Eger deyer verilibse Driver'i eynı
        sehifede RETURN et. Bunun sadece etmek lazim olan if(driver==null) istifade etmek
         */
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
//                    ChromeOptions options= new ChromeOptions();
//                    options.addArguments("--headless"); // Headless test yapmak icin
//                    options.addArguments("--disaple-gpu"); //GPU kullanimini devre disi birakir
//                   driver= new ChromeDriver(options); //bu kodu headless testte acarsinizi

                    //asagidaki kodlar file download ederken default deyer olan download fayli yerine bir yol vermeyimize yarayir
//                    ChromeOptions options = new ChromeOptions();
//                    String filePath ="C:\\Khayyam Almas";

//                    Map<String, Object> prefs = new HashMap<>();
//                    prefs.put("download.default_directory", filePath);
//                    options.setExperimentalOption("prefs", prefs);
                    //  driver = new ChromeDriver(options);  //bu setirdaki komment slashlarini alt setira endirib isletmeliyik.

                    driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
                    break;
                case "seleniumGridChrome":

                    FirefoxOptions options=new FirefoxOptions();
                    capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS,options);

//                    ChromeOptions options=new ChromeOptions();
//                    capabilities.setCapability(ChromeOptions.CAPABILITY,options);
                    try {
                        driver=new RemoteWebDriver(new URL("http://192.168.1.101:4444"),capabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "edge":

                    driver = new EdgeDriver(new EdgeOptions().addArguments("--remote-allow-origins=*"));
                    break;

                default:

                    driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return driver;
    }

    public static void closeDriver() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {//Driver'a deyer verilibse
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver() {
        if (driver != null) {//Driver'a deyer verilibse
            driver.quit();
            driver = null;
        }
    }
}
