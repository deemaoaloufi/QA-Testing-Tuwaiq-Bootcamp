package GitHubWeb;
import Base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import Pages.PageOne;
import Pages.PageTwo;
import org.testng.annotations.Test;
public class GithubTest extends BaseClass  {

    //  Positive Tests
    @Test
    public void SignInMethod() throws InterruptedException { //Test for register
        PageOne SignIn = new PageOne(driver);

        SignIn.openwebsiteUrl();
        SignIn.SignInProcess();
        Thread.sleep(3000);

    }


    @Test
    public void CreateNewRepoMethod() throws InterruptedException { //Test creating new Repo
        PageOne NewRepo = new PageOne(driver);

        NewRepo.openwebsiteUrl();
        NewRepo.SignInProcess();
        NewRepo.CreateRepo();
        Thread.sleep(3000);
    }

    @Test
    public void SaerchforRepoMethod() throws InterruptedException { //Test searching for a repo+sorting+add to fav
        PageOne SearchRepo = new PageOne(driver);

        SearchRepo.openwebsiteUrl();
        SearchRepo.SignInProcess();
        SearchRepo.SearchforRepo();
        Thread.sleep(3000);
    }

    @Test
    public void EditProfileMethod() throws InterruptedException { //Test editing the profile and save the changes
        PageOne EditProfile = new PageOne(driver);

        EditProfile.openwebsiteUrl();
        EditProfile.SignInProcess();
        EditProfile.EdiProfile();
        Thread.sleep(3000);
    }

    @Test
    public void ExploreMethod() throws InterruptedException { //Test Exploring GitHub+sort+deepSorting
        PageOne exploring = new PageOne(driver);

        exploring.openwebsiteUrl();
        exploring.SignInProcess();
        exploring.Explore();
        Thread.sleep(3000);
    }

    @Test
    public void ExploreViaSerachMethod() throws InterruptedException { //Test Exploring GitHub+sort+deepSorting
        PageOne exploring = new PageOne(driver);

        exploring.openwebsiteUrl();
        exploring.SignInProcess();
        exploring.ExploreiaSearch();
        Thread.sleep(3000);
    }


    //  Negative Tests
    @Test
    public void SignInInvalidCredentialsMethod() throws InterruptedException {//Test when Sign in data incorrect
        PageTwo neg = new PageTwo(driver);
        PageOne Open = new PageOne(driver);

        Open.openwebsiteUrl();
        neg.SignInWithInvalidCredentials();
        Thread.sleep(2000);
        boolean errorDisplayed = driver.findElement(By.cssSelector(".flash-error")).isDisplayed();
        Assert.assertTrue(errorDisplayed, "Error message not shown for invalid login.");
    }



    @Test
    public void SearchNonExistentRepoTest() throws InterruptedException { //Teat when searching for non existed Repo
        PageTwo neg = new PageTwo(driver);
        PageOne Open = new PageOne(driver);

        Open.openwebsiteUrl();
        Open.SignInProcess();
        neg.SearchForNonExistentRepo();
        Thread.sleep(2000);

    }

    @Test
    public void CreateRepoMissingNameMethod() throws InterruptedException {//Test when creating Repo with null name
        PageTwo neg = new PageTwo(driver);
        PageOne Open = new PageOne(driver);

        Open.openwebsiteUrl();
        Open.SignInProcess();
        neg.CreateRepoWithMissingData();
        Thread.sleep(2000);

    }




}





