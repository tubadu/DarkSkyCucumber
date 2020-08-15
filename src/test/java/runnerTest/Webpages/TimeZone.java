package runnerTest.Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class TimeZone extends ElementUtil{
    By hours = By.xpath("//div[@class='scroll-container']//span[@class='hour']");
    By location = By.xpath("//form[@id='searchForm']/input[@type='text']");
    By searchBtn = By.className("searchButton");
    By temp = By.xpath("//div[@class='dayDetails revealed']//span[contains(@style,'opacity')]");



    public String getDarkSkyPageTitle() throws InterruptedException {
        Thread.sleep(1000);
        return BasePage.get().getTitle();
    }

    public boolean verifyHourFormat(String zoneId) {
        ZoneId timezone = ZoneId.of(zoneId);
        int hour = LocalTime.now(timezone).getHour();
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < getTimeline().size(); i++) {
            if (hour < 11) hour += 2;
            else hour -= 10;
            ls.add(hour);
        }
        return ls.equals(getTimeline());
    }
    public List<Integer> getTimeline() {
        List<WebElement> hour = webElements(hours);
        List<Integer> time = new ArrayList<Integer>();
        for (WebElement e : hour) {
            String t = e.getText();
            if (!t.isEmpty()) {
                int th = Integer.parseInt(t.replaceAll("[a-z]", ""));
                time.add(th);
            }
        }
        return time;
    }
    public void chooseLocation(String locationValue) throws InterruptedException {
        clear(location);
        sendValue(location, locationValue);
        Thread.sleep(2000);
        clickOn(searchBtn);
        Thread.sleep(2000);
    }
    public List<Integer> getTimeLineTemps() {
        List<WebElement> temps = webElements(temp);
        List<Integer> tempInt = new ArrayList<Integer>();
        for (WebElement e : temps) {
            int t = Integer.parseInt(e.getText().replaceAll("[^0-9]", ""));
            tempInt.add(t);
        }
        return tempInt;
    }


}
