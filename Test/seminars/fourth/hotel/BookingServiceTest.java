package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class BookingServiceTest {
    @Test
    void testRoomAvailable(){
        HotelService hotelServiceTest = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelServiceTest);
        when(hotelServiceTest.isRoomAvailable(2)).thenReturn(true);
        //verify(hotelServiceTest,times(1)).isRoomAvailable(2);
        assertTrue(bookingService.bookRoom(2));

    }
    @Test
    void testRoomNotAvailable(){
        HotelService hotelServiceTest = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelServiceTest);
        when(hotelServiceTest.isRoomAvailable(3)).thenReturn(false);
        //verify(bookingService.bookRoom(3),times(1));
        assertFalse(bookingService.bookRoom(3));

    }

}