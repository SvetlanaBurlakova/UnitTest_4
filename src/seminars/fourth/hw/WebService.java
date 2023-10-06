package seminars.fourth.hw;

public class WebService {
    HttpClient httpClient;

    public WebService(HttpClient httpClient){
        this.httpClient = httpClient;
    }
    public String GetHttpClient(String url){
        return httpClient.get(url);
    }
}
