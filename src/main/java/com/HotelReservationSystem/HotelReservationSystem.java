/*@Purpose : Hotel Reservation System
 * @File : Hotel Reservation System
 * @Author : Avinash Jadhav
 */

package com.HotelReservationSystem;

import java.util.ArrayList;

public class HotelReservationSystem {

	ArrayList<Hotel> hotelList = new ArrayList<>();
	Hotel hotel;
	
	

	public Hotel addHotel(String hotelName, double weekdayRateRegular)
	{
		hotel=new Hotel(hotelName, weekdayRateRegular);
		hotel.setHotelName(hotelName);
		hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);		 
		hotelList.add(hotel); 
		return hotel;
	}
}
