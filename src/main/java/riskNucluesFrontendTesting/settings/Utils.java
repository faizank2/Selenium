package riskNucluesFrontendTesting.settings;

/**
 * Edited by Faizan
 * This is Utils baseClass,
 * The class is defining chromeDriver Location and BaseUrl.
 */
public class Utils extends BaseTestClass {

    public final static String CHROME_DRIVER_LOCATION = "chromedriver";
    public final static String FIREFOX_DRIVER_LOCATION = "geckodriver";

    public static String Base_URL() {
        String BASE_URL;

        if (urlValue.equals("urlValue")) {

            BASE_URL = "http://localhost:4200/riskNucleus/";
        } else {
            BASE_URL = urlValue;
        }
        return BASE_URL;
    }
}
