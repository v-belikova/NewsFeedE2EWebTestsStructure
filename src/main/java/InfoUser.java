import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InfoUser {

    String homePageURL = "https://news-feed-2.dunice-testing.com/";
    SelenideElement stringMyProfile = Selenide.$x("*//a[contains(text(),'My profile')]");
}
