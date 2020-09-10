package com.example.barberbooking.Interface;

import com.example.barberbooking.Model.BookingInformation;

public interface IBookingInfoLoadListener {
    void onBookingInfoLoadEmpty();
    void onBookingInfoLoadSuccess(BookingInformation bookingInformation,String documentId);
    void onBookingInfoLoadFailed(String message);
}
