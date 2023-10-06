package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class WeatherReporterTest {
    @Test
    void testWeatherReporter() {
        //
        WeatherService weatherServiceMock = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);
        //
        when(weatherServiceMock.getCurrentTemperature()).thenReturn(20);
        //Act
        String result = weatherReporter.generateReport();
        //Assert
        assertEquals("Текущая температура 20 градусов", result);
        verify(weatherServiceMock,times(1)).getCurrentTemperature();


    }

}