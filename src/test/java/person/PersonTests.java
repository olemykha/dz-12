package person;

import org.example.Man;
import org.example.Woman;
import dataproviders.TestDataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PersonTests {

    @Test(dataProvider = "personsData", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(Man man, Woman woman) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(man.isRetired() == (man.getAge() >= 65), "The man's retirement status is incorrect");
        softAssert.assertTrue(woman.isRetired() == (woman.getAge() >= 60), "The woman's retirement status is incorrect");
        softAssert.assertAll();
    }

    @Test(dataProvider = "personsData", dataProviderClass = TestDataProvider.class)
    public void testRegisterPartnership(Man man, Woman woman) {
        String maidenName = woman.getLastName();
        woman.registerPartnership(man);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(woman.getPartner(), man, "The partner is incorrect");
        softAssert.assertEquals(man.getPartner(), woman, "The partner is incorrect");
        softAssert.assertEquals(woman.getLastName(), man.getLastName(), "The last name is incorrect");
        man.deregisterPartnership();
        softAssert.assertNull(woman.getPartner(), "The partner exists but should not");
        softAssert.assertNull(man.getPartner(), "The partner exists but should not");
        softAssert.assertEquals(woman.getLastName(), maidenName, "The maiden name is incorrect");
        softAssert.assertAll();
    }
}