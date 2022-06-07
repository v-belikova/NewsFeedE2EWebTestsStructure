import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyProfilePage {


    SelenideElement newPost = Selenide.$x("*//button[contains(text(),'New Post')]");
}
