public class HTTPRequest {


    public String createRequest(String cityName, String apikey) {

        String request = "";
        if (cityName != null && apikey != null) {
            request = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apikey;
        } else request = "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";
        return request;
    }

}



