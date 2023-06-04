package dataproviders;

import org.example.Man;
import org.example.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "personsData")
    public static Object[][] persons() {

        return new Object[][]{
                {
                        new Man("San", "Sun", 65,"GP",null), new Woman("Katya", "Girka", 62, "UK", null)
                },
                {
                        new Man("Pet", "Truu", 57,"USA", null), new Woman("Gabra", "Zel", 45, "IT", null
                )
                }
        };
    }
}