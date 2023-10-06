package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class DataProcessorTest {
    @Test
    void DataProcessorTest(){
        Database databaseMock = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(databaseMock);
        List<String> fakeData = new ArrayList<>();
        fakeData.add("1");
        fakeData.add("2");
        when(databaseMock.query("get")).thenReturn(fakeData);
        List<String> fakeData_res = databaseMock.query("get");
        verify(databaseMock,times(1)).query("get");
        assertThat(dataProcessor.processData("get")).isEqualTo(fakeData);


    }
}