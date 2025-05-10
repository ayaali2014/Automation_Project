package TestPages;

import Pages.TestCasesPage;
import org.testng.annotations.Test;
import utils.BaseTest;

public class TestCasesPageTest extends BaseTest {

    TestCasesPage obj;

    @Test
    public void checkTestCasesPage(){

        obj = new TestCasesPage(driver);

        obj.HomeCheck();
        obj.testCasesButtonFun();
        obj.verifyTestCasesButtonFun();
    }
}
