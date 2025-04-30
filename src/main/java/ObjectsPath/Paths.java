package ObjectsPath;

import org.openqa.selenium.By;

public class Paths {

    //Login Paths
    public static final By SignInOption = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");
    public static final By Uname = By.xpath("//*[@id=\"login_field\"]");
    public static final By UPassword = By.xpath("//*[@id=\"password\"]");
    public static final By SignButton = By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]");

    //CreateRepo Paths
    public static final By NewOption = By.xpath("//*[@id=\"global-create-menu-anchor\"]/span");
    public static final By NewRepOption = By.xpath("//*[@id=\":rc:\"]");
    public static final By RepoName = By.xpath("//*[@id=\":r5:\"]");
    public static final By PrivateOption = By.xpath("//*[@id=\":rg:\"]");
    public static final By RepoDesc = By.xpath("//*[@id=\":ra:\"]");
    public static final By CreateRepoBtn = By.xpath("/html/body/div[1]/div[5]/main/react-app/div/form/div[6]/button");

    //Search Paths
    public static final By SerachOption = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[1]/qbsearch-input/div[1]/div[1]/div/div/button");
    public static final By SerachTextBar = By.xpath("//*[@id=\"query-builder-test\"]\n");
    public static final By SortOption = By.xpath("//*[@id=\":R3iqjb:\"]");
    public static final By SortOptionRecUpdated = By.xpath("//*[@id=\":rh:\"]/div");
    public static final By StarFav = By.xpath("/html/body/div[1]/div[5]/main/react-app/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div/div[1]/div/div[2]/div/button\n");

    //Profile Paths
    public static final By SideMenu = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[4]/deferred-side-panel/include-fragment/react-partial-anchor/button/span/span/img");
    public static final By ProfileOption = By.xpath("//*[@id=\":rl:\"]");
    public static final By EditProfileBtn = By.xpath("/html/body/div[1]/div[5]/main/div/div/div[1]/div/div/div[3]/div[2]/div[2]/button");
    public static final By Name = By.xpath("//*[@id=\"user_profile_name\"]");
    public static final By SocialMedia1 = By.xpath("/html/body/div[1]/div[5]/main/div/div/div[1]/div/div/div[3]/div[1]/waiting-form/form/div[9]/social-account-editor[1]/div/input[2]");
    public static final By SocialMedia2 = By.xpath("/html/body/div[1]/div[5]/main/div/div/div[1]/div/div/div[3]/div[1]/waiting-form/form/div[9]/social-account-editor[2]/div/input[2]");
    public static final By SaveBtn = By.xpath("/html/body/div[1]/div[5]/main/div/div/div[1]/div/div/div[3]/div[1]/waiting-form/form/div[10]/button[1]");

    //Explore
    public static final By MainMenu = By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div/deferred-side-panel/include-fragment/button");
    public static final By ExploreOption = By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div/deferred-side-panel/include-fragment/dialog-helper/dialog/scrollable-region/div/div[1]/nav/nav-list/ul/li[9]/a");
    public static final By TrendingSort = By.xpath("/html/body/div[1]/div[5]/main/div[1]/nav/div/a[3]\n");
    public static final By DevSort = By.xpath("/html/body/div[1]/div[5]/main/div[3]/div/div[1]/nav/a[2]\n");
    public static final By ExSerachChk = By.xpath("/html/body/div[1]/div[5]/main/react-app/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div/div/div/div[1]/h3/div/div[2]/a/span\n");

    // Negative Test Locators
    public static By SignInError = By.cssSelector(".flash-error");
    public static By RepoNameError = By.xpath("/html/body/div[1]/div[5]/main/react-app/div/form/div[4]/div[1]/div[1]/div[1]/fieldset/div/div[2]/div/span[2]/span[2]");
    public static By NoSearchResult = By.xpath("/html/body/div[1]/div[5]/main/react-app/div/div/div[1]/div/div/div[2]/div[2]/div/div/div[4]/div/div[2]/div[1]/div/h3");


















}
