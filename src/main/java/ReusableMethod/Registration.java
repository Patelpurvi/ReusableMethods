package ReusableMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Registration extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    @BeforeMethod
    public void openbrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\Browserdrivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //open the website
        driver.get(loadProperties.getProperty("url"));}
    @AfterMethod
    public void closethebrowser(){
        driver.quit();}

        @Test
        public void userShouldBeAbleToRegisterSuccessfully(){
         //   click on register button
        clickelement(By.xpath("//a[@class='ico-register']"));

        //enter the first name
        enterText(By.id("FirstName"),loadProperties.getProperty("FirstName"));

        //enter the lastname
        enterText(By.xpath("//input[@name ='LastName']"),loadProperties.getProperty("LastName"));

        //select the Date
            selectByValue(By.xpath("//select[@name=\"DateOfBirthDay\"]"),loadProperties.getProperty("Date"));
        //select the Month
            selectByValue(By.xpath("//select[@name=\"DateOfBirthMonth\"]"),loadProperties.getProperty("Month"));
        // select the year
            selectByValue(By.xpath("//select[@name='DateOfBirthYear']"),loadProperties.getProperty("Year"));

            //Enter Email
        enterText(By.name("Email"), ("testtest" + randomDate() + "@test56.com"));

        //enter the password
        enterText(By.xpath("//input[contains(@name, 'Password')]"), loadProperties.getProperty("Password"));

        //enter the confirm password
        enterText(By.name("ConfirmPassword"),loadProperties.getProperty("ConformPassword"));

        //click on Register
        clickelement( By.id("register-button"));
            //Assert
            String expectgetMessage = "Your registration completed";
            String actualMessage = Text(By.xpath("//div[@class=\"result\"]"));
            Assert.assertEquals(actualMessage, expectgetMessage);
            //click on continue
         clickelement(By.xpath("//input[@class=\"button-1 register-continue-button\"]"));}

        @Test
            public void userShouldBeAbleToReferAProductToEmailAFriend(){
                //   click on register button
                clickelement(By.xpath("//a[@class='ico-register']"));

                //enter the first name
                enterText(By.id("FirstName"),loadProperties.getProperty("FirstName"));

                //enter the lastname
                enterText(By.xpath("//input[@name ='LastName']"),loadProperties.getProperty("LastName"));

            //select the Date
            selectByValue(By.xpath("//select[@name=\"DateOfBirthDay\"]"),loadProperties.getProperty("Date"));
            //select the Month
            selectByValue(By.xpath("//select[@name=\"DateOfBirthMonth\"]"),loadProperties.getProperty("Month"));
            // select the year
            selectByValue(By.xpath("//select[@name='DateOfBirthYear']"),loadProperties.getProperty("Year"));


            //Enter Email
                enterText(By.name("Email"),"testtest" + randomDate() +"@test56.com");

                //enter the password
               enterText(By.xpath("//input[contains(@name, 'Password')]"), loadProperties.getProperty("Password"));

                //enter the confirm password
                enterText(By.name("ConfirmPassword"),loadProperties.getProperty("ConformPassword"));

                //click on Register
                clickelement( By.id("register-button"));

            //click on continue
            clickelement(By.xpath("//input[@class=\"button-1 register-continue-button\"]"));

            //click on Electrical
            clickelement(By.xpath("//h2/a[@title=\"Show products in category Electronics\"]"));

            //click on Apple
            clickelement(By.linkText("Apple"));

            //click on AppleMacBook Pro 13-inch
            clickelement(By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]"));

            //Click on Email a friend
            clickelement(By.xpath("//div[@class=\"email-a-friend\"]"));

            //input the friend email address
            enterText(By.className("friend-email"),loadProperties.getProperty("friendemail"));

            //Enter the personal message
            enterText(By.id("PersonalMessage"),loadProperties.getProperty("PersonalMessage"));

            //click on send email
            clickelement(By.xpath("//div/input[contains(@type, 'submit')]"));

            //Assert
            String expectgetMessage = "Your message has been sent.";
            String actualMessage = Text(By.xpath("//div[@class=\"result\"]"));
            Assert.assertEquals(actualMessage, expectgetMessage); }

            @Test
            public void userShouldBeNavigateCameraAndPhotoPage() {
                //click on companylogo
                clickelement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));

                //click on Electrical
               clickelement(By.xpath("//h2/a[@title=\"Show products in category Electronics\"]"));

                //click on camera and photo
                clickelement(By.xpath(" //h2/a[@href=\"/camera-photo\"]"));

                //Assert
                String expectresult = "Camera & photo";
                String actualresult = Text(By.xpath("//div/div[@class=\"page-title\"]"));
                Assert.assertEquals(actualresult, expectresult); }
             @Test
             public void userShouldBeSelectTheJewelleryByFilter$700to$3000() {
                //click on jewellery
                 clickelement(By.linkText("Jewelry"));
                 //assert
                 String expectedTitle = "Jewelry";
                 String actualTitle = Text(By.linkText("Jewelry"));
                 Assert.assertEquals(actualTitle, expectedTitle);
                 //System.out.println("$2,100".substring(1).replace(",", ""));

                 //click on price$700-$3000
                 clickelement(By.xpath("//a[@href=\"//demo.nopcommerce.com/jewelry?price=700-3000\"]"));

                 //assert
                String expectedvalue = "$700.00 - $3,000.00";
                 String actualvalue = Text(By.xpath("//span[@class='item']"));
                 Assert.assertEquals(actualvalue,expectedvalue);
                 String ProductPrice = Text(By.xpath("//span[@class='price actual-price']"));
                 String price1 = String.valueOf(ProductPrice.replace("$", ""));
                 String price2 = String.valueOf(price1.replace(",",""));
                 double price = Double.valueOf(price2);
                 Assert.assertTrue(price>=700 && price <= 3000);
                }
    @Test
    public void userShouldBeAbleToAddTwoBooksInTheBasket(){
        //click on Books
        clickelement(By.linkText("Books"));
        //click on Fahrenheit 451 by Ray Bradbury
        clickelement(By.linkText("Fahrenheit 451 by Ray Bradbury"));
        //click on Add to Cart
        clickelement(By.id("add-to-cart-button-37"));
        //click on  book
        clickelement(By.xpath("//span[@itemprop=\"name\"]"));
        //click on First Prize Pies
        clickelement(By.linkText("First Prize Pies"));
        //click on Add to Cart
        clickelement(By.id("add-to-cart-button-38"));
        //click on Shopping Cart
        clickelement(By.className("cart-label"));

        //assert
        String expectedCartbook1 = "Fahrenheit 451 by Ray Bradbury";
        String actualCartbook2 = Text(By.linkText("Fahrenheit 451 by Ray Bradbury"));
        Assert.assertEquals(actualCartbook2,expectedCartbook1);

        //2 book assert
        String expectedCartbook2 = "First Prize Pies";
        String actualCartBook2 = Text(By.linkText("First Prize Pies"));
        Assert.assertEquals(actualCartBook2, expectedCartbook2);}
    }


