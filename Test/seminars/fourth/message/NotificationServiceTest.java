package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NotificationServiceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Test
    void sendNotificationTest(){
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);
        String message = "Отправка сообщения привет получателю Иван";
        //when(messageServiceMock.sendMessage("привет", "Иван")).
        //        thenReturn(outContent.toString());
        notificationService.sendNotification("привет", "Иван");

    }

}