package runnerTest.Webpages;

import org.openqa.selenium.By;

public class LoginPage extends ElementUtil {
   By API= By.xpath("//section//a[4]");
   By login=By.xpath("//a[@class='button']");
   By email=By.id("email");
   By password=By.id("password");
   By loginbutton=By.xpath("//button[@type='submit']");
   By errormessage=By.xpath("//div[@class='error']");
   public void clickbuttons(){
       clickOn(API);
       clickOn(login);
   }
   public void sendEmail(String emailid){
       sendValue(email,emailid);
   }
   public void sendpass(String pass){
       sendValue(password,pass);
   }
   public void clicklogin(){
       clickOn(loginbutton);
   }public String geterror(){

       return  getTextFromElement(errormessage);
    }








}
