package Pages;

import ObjectsPath.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.Paths.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class PageOne { //Positive TestCases

    WebDriver driver = null;

    public PageOne(WebDriver driver) {
        //Constructor For the web driver 'chrome'
        this.driver = driver;
    }

    //This method is to Open GitHub Web via Url
    public void openwebsiteUrl() {

        driver.get("https://github.com/");
    }

    //This method is to sign in with valid test data (Username, password)
    public void SignInProcess() {

        WebElement SignInBtn = driver.findElement(SignInOption);
        SignInBtn.click();

        WebElement UserName = driver.findElement(Uname);
        UserName.sendKeys("Bouthainh");

        WebElement Password = driver.findElement(UPassword);
        Password.sendKeys("Bebo@2024");

        WebElement SignInComplete = driver.findElement(SignButton);
        SignInComplete.click();

    }

    //This method is to create new a private repository with name and description
    public void CreateRepo() {

        WebElement CreateNew = driver.findElement(NewOption);
        CreateNew.click();

        WebElement chooseNewRepo = driver.findElement(NewRepOption);
        chooseNewRepo.click();

        WebElement addRepoName = driver.findElement(RepoName);
        addRepoName.sendKeys("try1");

        WebElement addRepoDesc = driver.findElement(RepoDesc);
        addRepoDesc.sendKeys("this is a test automation attempt, for a test Repo!");

        WebElement choosePrivateRepoOption = driver.findElement(PrivateOption);
        choosePrivateRepoOption.click();

        WebElement CreateRepoButton = driver.findElement(CreateRepoBtn);
        CreateRepoButton.click();
    }

    //This method is to search for a repo+sort+add to fav
    public void SearchforRepo() {

        WebElement Search = driver.findElement(SerachOption);
        Search.click();

        WebElement serchcntetnt = driver.findElement(SerachTextBar);
        serchcntetnt.sendKeys("Java Game Development");
        serchcntetnt.sendKeys(Keys.ENTER);

        WebElement Sorting = driver.findElement(SortOption);
        Sorting.click();

        WebElement UpdatedSorting = driver.findElement(SortOptionRecUpdated);
        UpdatedSorting.click();

        WebElement addtoFav = driver.findElement(StarFav);
        addtoFav.click();
    }


    //This method is to edit the user profile and save the changes
    public void EdiProfile() {

        WebElement openMenu = driver.findElement(SideMenu);
        openMenu.click();

        WebElement chooseProfile = driver.findElement(ProfileOption);
        chooseProfile.click();

        WebElement EditBtn = driver.findElement(EditProfileBtn);
        EditBtn.click();

        WebElement changeName = driver.findElement(Name);
        changeName.clear();
        changeName.sendKeys("Bouthainh A. AlGarni");

        WebElement addXaccount = driver.findElement(SocialMedia1);
        addXaccount.clear();
        addXaccount.sendKeys("https://twitter.com/bouthainh");

        WebElement addLInaccount = driver.findElement(SocialMedia2);
        addLInaccount.clear();
        addLInaccount.sendKeys("http://linkedin.com/in/bouthainh-algarni-21a0972a1");

        WebElement SaveChange = driver.findElement(SaveBtn);
        SaveChange.click();

    }

    //This method is to Explore GitHub via sort
    public void Explore() {

        WebElement mainmenu = driver.findElement(MainMenu);
        mainmenu.click();

        WebElement ExpOption = driver.findElement(ExploreOption);
        ExpOption.click();

        WebElement TrendsSort = driver.findElement(Paths.TrendingSort);
        TrendsSort.click();

        WebElement TrendDev = driver.findElement(DevSort);
        TrendDev.click();
    }

    //This method is to Explore GitHub via search bar
    public void ExploreiaSearch() {

        WebElement Search = driver.findElement(SerachOption);
        Search.click();

        WebElement ExSerch = driver.findElement(SerachTextBar);
        ExSerch.click();
        ExSerch.sendKeys("deemaoaloufi/KidCoin_App");
        ExSerch.sendKeys(Keys.ENTER);

        WebElement CheckResult = driver.findElement(Paths.ExSerachChk);
        Assert.assertTrue(CheckResult.isDisplayed(), "deemaoaloufi/KidCoin_App");

    }

    }