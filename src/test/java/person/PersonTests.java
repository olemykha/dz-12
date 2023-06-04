package person;

import org.example.Man;
import org.example.Woman;
import dataproviders.TestDataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PersonTests {

    @Test(dataProvider = "personsData", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(Man man, Woman woman){
        String maidenName = woman.getLastName();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(man.isRetired(), man.getAge() >= 65, "The status is incorrect");
        softAssert.assertEquals(woman.isRetired(), woman.getAge() >= 60, "The status is incorrect");
        woman.registerPartnership(man);
        softAssert.assertEquals(woman.getPartner(), man, "The partner is incorrect");
        softAssert.assertEquals(man.getPartner(), woman, "The partner is incorrect");
        softAssert.assertEquals(woman.getLastName(), man.getLastName(), "The last name is incorrect");
        man.deregisterPartnership();
        softAssert.assertEquals(woman.getPartner(), null, "The partner exists but should not");
        softAssert.assertEquals(man.getPartner(), null, "The partner exists but should not");
        softAssert.assertEquals(woman.getLastName(), maidenName, "The maiden name is incorrect" );
        softAssert.assertAll();
    }
}