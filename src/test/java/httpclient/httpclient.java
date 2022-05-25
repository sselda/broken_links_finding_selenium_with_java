package httpclient;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;



public class httpclient {

    public static void main (String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "/Users//User//Selenium//ChromeDriver//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();


            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://demoqa.com/");
            HttpResponse response = client.execute(request);
            System.out.println(response.getStatusLine());
            System.out.println(response.getStatusLine().getStatusCode());

    }
}
