package seminars.fourth.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class HttpClientTest {
    @Test
    void GetHttpClientTest(){
        HttpClient httpClient = mock(HttpClient.class);
        WebService webService = new WebService(httpClient);
        when(httpClient.get("http")).thenReturn("Данные с сайта! http");
        String result = httpClient.get("http");
        verify(httpClient,times(1)).get("http");
        assertThat(webService.GetHttpClient("http")).isEqualTo("Данные с сайта! http");
    }
}
