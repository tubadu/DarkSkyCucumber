package runnerTest.Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends ElementUtil{

    By todayclick = By.xpath("//a[@data-day='0']");
   private   By lowTemp=By.xpath("//a[@data-day='0']//span[@class='minTemp']");
   private By temperature= By.xpath("(//div[@class='temps'])[2]//span//span");
   private By maxTemp=By.xpath("//a[@data-day='0']//span[@class='maxTemp']");

    public void temperature() {
        WebElement element = BasePage.get().findElement(todayclick);
        JavaScruptUtil.scrollIntoView(element, BasePage.get());
        WebDriverWait wait = new WebDriverWait(BasePage.get(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(todayclick));
        BasePage.get().findElement(todayclick).click();


    }

    static ArrayList<Integer> tempListInt = new ArrayList<Integer>();

    public ArrayList<Integer> getTempList(){
        WebDriverWait wait= new WebDriverWait(BasePage.get(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(temperature));
        List<WebElement> tempList= BasePage.get().findElements(temperature);
        for (int i = 0; i < tempList.size(); i++) {
            String tempText= tempList.get(i).getText().substring(0, 2);
            tempListInt.add(Integer.parseInt(tempText));

        }

        return tempListInt;
    }
    public  int minTemp(){
        Collections.sort(tempListInt);
        return tempListInt.get(0);
    }
    public  int maxTemp(){
        Collections.sort(tempListInt);
        return tempListInt.get(11);
    }
    public int verifymintemp(){
        WebElement lowtemp=BasePage.get().findElement(lowTemp);
        String lowww=lowtemp.getText().substring(0,2);
        int low= Integer.parseInt(lowww);
        return low;


    }
    public int verifymaxtemp(){
        WebElement maxtemp=BasePage.get().findElement(maxTemp);
        String maxxx=maxtemp.getText().substring(0,2);
        int max= Integer.parseInt(maxxx);
        return max;

    }
}



