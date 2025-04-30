package Pages;

import ObjectsPath.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.Paths.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;


public class PageTwo { //Negative TestCases

    WebDriver driver = null;

    public PageTwo(WebDriver driver) {
        this.driver = driver;
    }


    public void SignInWithInvalidCredentials() {
        WebElement SignInBtn = driver.findElement(SignInOption);
        SignInBtn.click();

        WebElement UserName = driver.findElement(Uname);
        UserName.sendKeys("WrongUser");

        WebElement Password = driver.findElement(UPassword);
        Password.sendKeys("WrongPassword!");

        WebElement SignInComplete = driver.findElement(SignButton);
        SignInComplete.click();

        WebElement errorBanner = driver.findElement(Paths.SignInError);
        Assert.assertTrue(errorBanner.isDisplayed(), "Sign-in error message not displayed.");
    }

    public void SearchForNonExistentRepo() {
        WebElement Search = driver.findElement(SerachOption);
        Search.click();

        WebElement searchContent = driver.findElement(SerachTextBar);
        searchContent.sendKeys("!@#$%^&*()");
        searchContent.sendKeys(Keys.ENTER);

        WebElement noResult = driver.findElement(Paths.NoSearchResult);
        Assert.assertTrue(noResult.isDisplayed(), "Your search did not match any repositories\n");
    }

    public void CreateRepoWithMissingData() {
        WebElement CreateNew = driver.findElement(NewOption);
        CreateNew.click();

        WebElement chooseNewRepo = driver.findElement(NewRepOption);
        chooseNewRepo.click();

        WebElement CreateRepoButton = driver.findElement(CreateRepoBtn);
        CreateRepoButton.click();

        WebElement nameError = driver.findElement(Paths.RepoNameError);
        Assert.assertTrue(nameError.isDisplayed(), "New repository name must not be blank");
    }



}
