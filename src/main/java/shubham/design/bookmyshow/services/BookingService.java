package shubham.design.bookmyshow.services;

import shubham.design.bookmyshow.models.Booking;
import shubham.design.bookmyshow.models.Show;
import shubham.design.bookmyshow.models.ShowSeat;
import shubham.design.bookmyshow.models.User;
import shubham.design.bookmyshow.repositories.BookingRepository;
import shubham.design.bookmyshow.repositories.ShowSeatRepository;

import java.util.List;

public class BookingService {
    private BookingRepository bookingRepository;
    private ShowSeatRepository showSeatRepository;

    public Booking createBooking(User user, Show show, List<ShowSeat> showSeats) {
        return null;
    }
}
