import org.testng.Assert;
import org.testng.annotations.Test;

public class HTTPRequestTest {

    //1. Positive testing Happy path
    // if language = Greek

    @Test
    public void testRequestCityNameInGreek() {

        String cityNameGreek = "Λονδίνο";
        String apikey = "3376fe14700d807714ceab155284be11";
        String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q=Λονδίνο&appid=" +
                "3376fe14700d807714ceab155284be11";
        String actualResult = new HTTPRequest().createRequest(cityNameGreek, apikey);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //2. Positive testing Happy path
    // if language = Persian

    @Test
    public void testRequestCityNameInPersian() {

        String cityNamePersian = "لندن";
        String apikey = "3376fe14700d807714ceab155284be11";
        String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q=لندن&appid=" +
                "3376fe14700d807714ceab155284be11";
        String actualResult = new HTTPRequest().createRequest(cityNamePersian, apikey);

        Assert.assertEquals(actualResult, expectedResult);

    }


    //3. Positive testing Happy path
    // if language = Hindi

    @Test
    public void testRequestCityNameInHindi() {

        String cityNameHindi = "लंदन";
        String apikey = "3376fe14700d807714ceab155284be11";
        String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q=लंदन&appid=" +
                "3376fe14700d807714ceab155284be11";
        String actualResult = new HTTPRequest().createRequest(cityNameHindi, apikey);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //4. Positive testing Happy path
    // if language = French

    @Test
    public void testRequestCityNameInFrench() {

        String cityNameFrench = "Londres";
        String apikey = "3376fe14700d807714ceab155284be11";
        String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q=Londres&appid=" +
                "3376fe14700d807714ceab155284be11";
        String actualResult = new HTTPRequest().createRequest(cityNameFrench, apikey);

        Assert.assertEquals(actualResult, expectedResult);

    }
    //5. Positive testing Happy path
    // if language = Hindi

    @Test
    public void testRequestCityNameInEnglish() {

        String cityNameEnglish = "London";
        String apikey = "3376fe14700d807714ceab155284be11";
        String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q=London&appid=" +
                "3376fe14700d807714ceab155284be11";
        String actualResult = new HTTPRequest().createRequest(cityNameEnglish, apikey);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //6. Negative test
    // if cityName  = null
    @Test

    public void testRequestCityNameIsNull() {

        String cityNameEnglish = null;
        String apikey = "3376fe14700d807714ceab155284be11";
        String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";
        String actualResult = new HTTPRequest().createRequest(cityNameEnglish, apikey);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 7. Negative test
    // if apikey  = null
    @Test

    public void testRequestApiKeyIsNull() {

        String cityNameEnglish = "London";
        String apikey = null;
        String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";
        String actualResult = new HTTPRequest().createRequest(cityNameEnglish, apikey);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //8. Response Test Greek And Persian

    @Test
    public void testResponseGreekAndPersian() {

        String responsecityNameGreek = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803,\"main\"" +
                ":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\",\"main\":" +
                "{\"temp\":287.74,\"feels_like\":287.45,\"temp_min\":286.64,\"temp_max\":288.98,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\"" +
                ":{\"all\":75},\"dt\":1666199252,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\"" +
                ":1666161048,\"sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
        String responsecityNamePersian = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803,\"main" +
                "\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\",\"main\":" +
                "{\"temp\":287.72,\"feels_like\":287.43,\"temp_min\":286.64,\"temp_max\":288.98,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\"" +
                ":{\"all\":75},\"dt\":1666199406,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\"" +
                ":1666161048,\"sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";

        Assert.assertEquals(responsecityNameGreek,responsecityNamePersian);

    }

    //9. Response Test Hindi and Persian

    @Test
    public void testResponseHindiAndPersian() {

        String responsecityNamePersian = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803," +
                "\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\"," +
                "\"main\":{\"temp\":287.72,\"feels_like\":287.43,\"temp_min\":286.64,\"temp_max\":288.98,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\"" +
                ":{\"all\":75},\"dt\":1666199406,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\"" +
                ":1666161048,\"sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
        String responsecityNameHindi = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803," +
                "\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\"," +
                "\"main\":{\"temp\":287.68,\"feels_like\":287.38,\"temp_min\":286.64,\"temp_max\":288.91,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\"" +
                ":{\"all\":75},\"dt\":1666199470,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\"" +
                ":1666161048,\"sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";

        Assert.assertEquals(responsecityNameHindi,responsecityNamePersian);

    }

    //10. Response Test Hindi and French

    @Test
    public void testResponseHindiAndFrench() {

        String responsecityNameHindi = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803," +
                "\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\"," +
                "\"main\":{\"temp\":287.68,\"feels_like\":287.38,\"temp_min\":286.64,\"temp_max\":288.91,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\"" +
                "{\"all\":75},\"dt\":1666199470,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\"" +
                ":1666161048,\"sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
        String responsecityNameFrench = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803," +
                "\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\"," +
                "\"main\":{\"temp\":287.72,\"feels_like\":287.43,\"temp_min\":286.64,\"temp_max\":288.98,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\"" +
                ":{\"all\":75},\"dt\":1666199401,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\"" +
                ":1666161048,\"sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";



        Assert.assertEquals(responsecityNameHindi,responsecityNameFrench);

    }
    //11. Response Test English and French

    @Test
    public void testResponseEnglishAndFrench() {

    String responsecityNameFrench = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803," +
                "\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\"," +
                "\"main\":{\"temp\":287.72,\"feels_like\":287.43,\"temp_min\":286.64,\"temp_max\":288.98,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\":{\"all\"" +
                ":75},\"dt\":1666199401,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\":1666161048,\"" +
                "sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
    String responsecityNameEnglish = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":803," +
                "\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\"," +
                "\"main\":{\"temp\":287.74,\"feels_like\":287.45,\"temp_min\":286.79,\"temp_max\":288.98,\"pressure\"" +
                ":1014,\"humidity\":84},\"visibility\":10000,\"wind\":{\"speed\":10.29,\"deg\":90},\"clouds\":{\"all\"" +
                ":75},\"dt\":1666198947,\"sys\":{\"type\":2,\"id\":2075535,\"country\":\"GB\",\"sunrise\":1666161048,\"" +
                "sunset\":1666198791},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";


        Assert.assertEquals(responsecityNameEnglish,responsecityNameFrench);

    }

}

